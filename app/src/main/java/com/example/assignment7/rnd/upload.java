package com.example.assignment7.rnd;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.assignment7.R;

public class upload extends Fragment {

    private EditText emailInput, passwordInput;
    private Button signInButton, continueWithoutSignInButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_upload, container, false);

        // Initialize views
        emailInput = view.findViewById(R.id.email_input);
        passwordInput = view.findViewById(R.id.password_input);
        signInButton = view.findViewById(R.id.sign_in_button);
        continueWithoutSignInButton = view.findViewById(R.id.continue_without_sign_in_button);

        // Set click listener for sign-in button
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get entered email and password
                String email = emailInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                // Check if email and password are not empty
                if (!email.isEmpty() && !password.isEmpty()) {
                    // Here, you would typically perform authentication,
                    // such as calling a server API or checking credentials locally
                    // For simplicity, let's assume a basic check
                    if (email.equals("prantadas85463@gmail.com") && password.equals("12345")) {
                        // Successful sign-in, you can do further actions here
                        Toast.makeText(getContext(), "Sign-in successful", Toast.LENGTH_SHORT).show();
                    } else {
                        // Failed sign-in
                        Toast.makeText(getContext(), "Invalid email or password", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // Empty email or password
                    Toast.makeText(getContext(), "Please enter email and password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Set click listener for continue without sign-in button
        continueWithoutSignInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Pop the back stack to navigate back to the previous fragment
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

        return view;
    }
}

