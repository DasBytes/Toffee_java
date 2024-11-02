package com.example.assignment7.rnd;

import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.assignment7.Editorschoice;
import com.example.assignment7.catagories;
import com.example.assignment7.Tidbits;
import com.example.assignment7.R;
import com.example.assignment7.popularTVChannels;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {
    private ViewFlipper simpleviewflipper;
    //polulartvchannel
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
//categories
    private catagories adapter;
    //tidbits
   private Tidbits adapter2;
   private List<Integer> imageIds;
private  List<Integer>imageIds2;
//editorschoice
     int NUM_COLUMNS=2;
    private ArrayList<String> Names=new ArrayList<>();
    private ArrayList<String> imageurl=new ArrayList<>();
    //trending channel
    private ArrayList<String> mNames1 = new ArrayList<>();
    private ArrayList<String> mImageUrls1 = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home2, container, false);
        initRecyclerView(view);
        initRecyclerView1(view);

        simpleviewflipper = view.findViewById(R.id.viewflipper);
//categories

        RecyclerView  recyclerid= view.findViewById(R.id.recycle2);

        recyclerid.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        // Sample drawable resource IDs
        imageIds = new ArrayList<>();
        imageIds.add(R.drawable.img20);
        imageIds.add(R.drawable.img21);
        imageIds.add(R.drawable.img22);
        imageIds.add(R.drawable.img23);
        imageIds.add(R.drawable.img24);
        imageIds.add(R.drawable.img25);
        imageIds.add(R.drawable.img26);


        adapter = new catagories(getActivity(), imageIds);
        recyclerid.setAdapter(adapter);

   //tidbits
        RecyclerView  recyclerid2= view.findViewById(R.id.recycle3);

        recyclerid2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        imageIds2 = new ArrayList<>();
        imageIds2.add(R.drawable.img30);
        imageIds2.add(R.drawable.img31);
        imageIds2.add(R.drawable.img32);
        imageIds2.add(R.drawable.img33);

        adapter2 = new Tidbits(getActivity(), imageIds2);
        recyclerid2.setAdapter(adapter2);
        //editorschoice
        RecyclerView recyclerView=view.findViewById(R.id.recycle4);
        Editorschoice adapter=new Editorschoice(getActivity(),Names,imageurl);
        recyclerView.setAdapter(adapter);
        //recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(NUM_COLUMNS,LinearLayoutManager.VERTICAL));
        intImagebitmaps();
        // Set animations
        Animation in = AnimationUtils.loadAnimation(getActivity(), android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(getActivity(), android.R.anim.slide_out_right);
        simpleviewflipper.setInAnimation(in);
        simpleviewflipper.setOutAnimation(out);
        return view;
    }




//populartvchannels
    private void initRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recycle1);
        popularTVChannels adapter = new popularTVChannels(getActivity(), mNames, mImageUrls);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));


        mImageUrls.add("https://images.toffeelive.com/images/program/26939/logo/240x240/mobile_logo_570467001711149160.png");
        mNames.add("");

        mImageUrls.add("https://images.toffeelive.com/images/program/287497/logo/240x240/mobile_logo_644514001712755411.png");
        mNames.add("");

        mImageUrls.add("https://images.toffeelive.com/images/program/19779/logo/240x240/mobile_logo_141811001712122330.png");
        mNames.add("");

        mImageUrls.add("https://images.toffeelive.com/images/program/2708/logo/240x240/mobile_logo_406284001687254721.png");
        mNames.add("");

        mImageUrls.add("https://images.toffeelive.com/images/program/44878/logo/240x240/mobile_logo_889093001687255310.png");
        mNames.add("");


    }
    private void intImagebitmaps() {

        imageurl.add("https://images.toffeelive.com/images/program/290919/logo/web-logo/web_thumb_landscape_original_poster_571241001712772271.png");
Names.add("Renu| Mithila & Arosh Khan | Toffee Exclusive ");
        imageurl.add("https://images.toffeelive.com/images/program/290912/logo/196x110/web_logo_277817001712703279.png");
  Names.add("Episode 1| Dirilis Ertugrul | Season 3");
        imageurl.add("https://images.toffeelive.com/images/program/290920/logo/196x110/web_logo_718213001712796387.png");
Names.add("Dano Presents Safoyan er mistimukh | Episode 7| ");
        imageurl.add("https://images.toffeelive.com/images/program/260700/logo/web-logo/web_thumb_landscape_original_poster_525079001707803205.png");
Names.add("Damal Full Movie");

    }
    //populartvchannels
    private void initRecyclerView1(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recycle5);
        popularTVChannels adapter1 = new popularTVChannels(getActivity(), mNames1, mImageUrls1);
        recyclerView.setAdapter(adapter1);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));


        mImageUrls1.add("https://images.toffeelive.com/images/channels/profile/59237162/e8a334a448a093a647daf1a707b97cc0.png");
        mNames1.add("CMV");

        mImageUrls1.add("https://images.toffeelive.com/images/channels/profile/50172104/91c5080858177b3c35795b430bae347e.png");
        mNames1.add("CINEMAWALA");

        mImageUrls1.add("https://images.toffeelive.com/images/channels/profile/58111878/38dd3405b2307d17d379a80fdced6cc4.png");
        mNames1.add("CV Vision");

        mImageUrls1.add("https://images.toffeelive.com/images/channels/profile/53631181/5a021918fc875f60e9a66d60bd3603a1.png");
        mNames1.add("MK Production");

        mImageUrls1.add("https://images.toffeelive.com/images/channels/profile/7446734/871e8b2ccf8ba4a5bc1cb76dade68c45.png");
        mNames1.add("Pavilion");

        mImageUrls1.add("https://images.toffeelive.com/images/channels/profile/8674986/1ea3fbfdeb797031ff479f7baff28b97.png");
        mNames1.add("Noyon TV");


        mImageUrls1.add("https://images.toffeelive.com/images/channels/profile/56862005/6480068e67dea162ea44f701bc273a0c.png");
        mNames1.add("Maasranga");

        mImageUrls1.add("https://images.toffeelive.com/images/channels/profile/51865455/3dd3c229401797a0f6fa2e1921458c18.png");
        mNames1.add("Cricfenzy");

        mImageUrls1.add("https://images.toffeelive.com/images/channels/profile/64126689/c7fc7a10d703d0bde3c64f908d5125e8.png");
        mNames1.add("Sports Analytica");

        mImageUrls1.add("https://images.toffeelive.com/images/channels/profile/7933525/edadf2d052890a652bbae9211a1bb347.png");
        mNames1.add("Shafin Ahmed");

    }
}

