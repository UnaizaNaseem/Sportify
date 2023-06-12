package com.example.sportify;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import java.util.ArrayList;
import java.util.List;

public class frag4 extends Fragment {

    private ViewPager2 viewPager;
    private CarouselAdapter adapter;
    private List<CarouselItem> items;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    private ArrayList<News> newsArrayList,newsArrayList1,newsArrayList2,newsArrayList3,newsArrayList4,newsArrayList5,newsArrayList6,newsArrayList7,newsArrayList8;
    private String[] newsHeading,newsHeading1,newsHeading2,newsHeading3,newsHeading4,newsHeading5,newsHeading6,newsHeading7,newsHeading8;
    private int[] imageResourceID,imageResourceID1,imageResourceID2,imageResourceID3,imageResourceID4,imageResourceID5,imageResourceID6,imageResourceID7,imageResourceID8;
    private RecyclerView recyclerview, recyclerview2, recyclerview3, recyclerview4, recyclerview5, recyclerview6, recyclerview7, recyclerview8, recyclerview9;
    private ScrollView scrollView;

    public frag4() {
        // Required empty public constructor
    }


    public static frag4 newInstance(String param1, String param2) {
        frag4 fragment = new frag4();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_frag4, container, false);
        viewPager = view.findViewById(R.id.viewPager);
        Button BTN_VIEWALL1 = view.findViewById(R.id.btn_viewall1);
        Button BTN_VIEWALL2 = view.findViewById(R.id.btn_viewall2);
        Button BTN_VIEWALL3 = view.findViewById(R.id.btn_viewall3);
        Button BTN_VIEWALL4 = view.findViewById(R.id.btn_viewall4);
        Button BTN_VIEWALL5 = view.findViewById(R.id.btn_viewall5);
        Button BTN_VIEWALL6 = view.findViewById(R.id.btn_viewall6);
        Button BTN_VIEWALL7 = view.findViewById(R.id.btn_viewall7);
        Button BTN_VIEWALL8 = view.findViewById(R.id.btn_viewall8);
        Button BTN_VIEWALL9 = view.findViewById(R.id.btn_viewall9);

        BTN_VIEWALL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), View_btn_cricket.class);

                startActivity(intent);

            }
        });
        BTN_VIEWALL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), View_btn_Tennis.class);

                startActivity(intent);

            }
        });


        BTN_VIEWALL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), View_btn_NHL.class);

                startActivity(intent);

            }
        });
        BTN_VIEWALL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), View_btn_NPL.class);

                startActivity(intent);

            }
        });
        BTN_VIEWALL5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), View_btn_Master.class);

                startActivity(intent);

            }
        });
        BTN_VIEWALL6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), View_btn_NFL.class);

                startActivity(intent);

            }
        });

        BTN_VIEWALL7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), View_btn_Football.class);

                startActivity(intent);

            }
        });
        BTN_VIEWALL8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), View_btn_EPL.class);

                startActivity(intent);

            }
        });
        BTN_VIEWALL9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), View_btn_F1.class);

                startActivity(intent);

            }
        });


        items = new ArrayList<>();
        items.add(new CarouselItem( R.drawable.ff));
        items.add(new CarouselItem(R.drawable.zz));
        items.add(new CarouselItem(R.drawable.mm));
        items.add(new CarouselItem( R.drawable.ll));
        items.add(new CarouselItem(R.drawable.oo));
        items.add(new CarouselItem( R.drawable.pp));
        adapter = new CarouselAdapter(items);
        viewPager.setAdapter(adapter);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dataInitialize();

        recyclerview = view.findViewById(R.id.recycler_view);
        recyclerview2 = view.findViewById(R.id.recycler_view2);
        recyclerview3 = view.findViewById(R.id.recycler_view3);
        recyclerview4 = view.findViewById(R.id.recycler_view4);
        recyclerview5 = view.findViewById(R.id.recycler_view5);
        recyclerview6 = view.findViewById(R.id.recycler_view6);
        recyclerview7 = view.findViewById(R.id.recycler_view7);
        recyclerview8 = view.findViewById(R.id.recycler_view8);
        recyclerview9 = view.findViewById(R.id.recycler_view9);

        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview2.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview3.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview4.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview5.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview6.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview7.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview8.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerview9.setLayoutManager(new LinearLayoutManager(getContext()));

        recyclerview.setHasFixedSize(true);
        recyclerview2.setHasFixedSize(true);
        recyclerview3.setHasFixedSize(true);
        recyclerview4.setHasFixedSize(true);
        recyclerview5.setHasFixedSize(true);
        recyclerview6.setHasFixedSize(true);
        recyclerview7.setHasFixedSize(true);
        recyclerview8.setHasFixedSize(true);
        recyclerview9.setHasFixedSize(true);

        MyAdapter myAdapter = new MyAdapter(getContext(), newsArrayList);
        MyAdapter myAdapter2 = new MyAdapter(getContext(), newsArrayList1);
        MyAdapter myAdapter3 = new MyAdapter(getContext(), newsArrayList2);
        MyAdapter myAdapter4 = new MyAdapter(getContext(), newsArrayList3);
        MyAdapter myAdapter5 = new MyAdapter(getContext(), newsArrayList4);
        MyAdapter myAdapter6 = new MyAdapter(getContext(), newsArrayList5);
        MyAdapter myAdapter7 = new MyAdapter(getContext(), newsArrayList6);
        MyAdapter myAdapter8 = new MyAdapter(getContext(), newsArrayList7);
        MyAdapter myAdapter9 = new MyAdapter(getContext(), newsArrayList8);


        recyclerview.setAdapter(myAdapter);
        recyclerview2.setAdapter(myAdapter2);
        recyclerview3.setAdapter(myAdapter3);
        recyclerview4.setAdapter(myAdapter4);
        recyclerview5.setAdapter(myAdapter5);
        recyclerview6.setAdapter(myAdapter6);
        recyclerview7.setAdapter(myAdapter7);
        recyclerview8.setAdapter(myAdapter8);
        recyclerview9.setAdapter(myAdapter9);

        myAdapter.notifyDataSetChanged();
        myAdapter2.notifyDataSetChanged();
        myAdapter3.notifyDataSetChanged();
        myAdapter4.notifyDataSetChanged();
        myAdapter5.notifyDataSetChanged();
        myAdapter6.notifyDataSetChanged();
        myAdapter7.notifyDataSetChanged();
        myAdapter8.notifyDataSetChanged();
        myAdapter9.notifyDataSetChanged();
    }


    private void dataInitialize() {
        newsArrayList = new ArrayList<>();

        newsHeading= new String[]{
                getString(R.string.head_1),
                getString(R.string.head_2),
                getString(R.string.head_3),
                getString(R.string.head_4),
                getString(R.string.head_5)
        };

        imageResourceID = new int[]{
                R.drawable.c1,
                R.drawable.c2,
                R.drawable.c3,
                R.drawable.c4,
                R.drawable.c5
        };

        for (int i = 0; i < newsHeading.length; i++) {
            News news = new News(newsHeading[i], imageResourceID[i]);
            newsArrayList.add(news);
        }

        newsArrayList1 = new ArrayList<>();

        newsHeading1 = new String[]{
                getString(R.string.head_6),
                getString(R.string.head_7),
                getString(R.string.head_8),
                getString(R.string.head_9),
                getString(R.string.head_10)
        };

        imageResourceID1 = new int[]{
                R.drawable.t1,
                R.drawable.t2,
                R.drawable.t3,
                R.drawable.t4,
                R.drawable.t5
        };

        for (int i = 0; i < newsHeading1.length; i++) {
            News news = new News(newsHeading1[i], imageResourceID1[i]);
            newsArrayList1.add(news);
        }


        newsArrayList2 = new ArrayList<>();

        newsHeading2 = new String[]{
                getString(R.string.head_11),
                getString(R.string.head_12),
                getString(R.string.head_13),
                getString(R.string.head_14),
                getString(R.string.head_15)
        };

        imageResourceID2 = new int[]{
                R.drawable.nhl1,
                R.drawable.nhl2,
                R.drawable.nhl3,
                R.drawable.nhl4,
                R.drawable.nhl5,

        };

        for (int i = 0; i < newsHeading2.length; i++) {
            News news = new News(newsHeading2[i], imageResourceID2[i]);
            newsArrayList2.add(news);
        }

        newsArrayList3 = new ArrayList<>();

        newsHeading3 = new String[]{
                getString(R.string.head_16),
                getString(R.string.head_17),
                getString(R.string.head_18),
                getString(R.string.head_19),
                getString(R.string.head_20)
        };

        imageResourceID3 = new int[]{
                R.drawable.nba1,
                R.drawable.nba2,
                R.drawable.nba3,
                R.drawable.nba4,
                R.drawable.nba5,

        };

        for (int i = 0; i < newsHeading3.length; i++) {
            News news = new News(newsHeading3[i], imageResourceID3[i]);
            newsArrayList3.add(news);
        }

        newsArrayList4 = new ArrayList<>();

        newsHeading4 = new String[]{
                getString(R.string.head_21),
                getString(R.string.head_22),
                getString(R.string.head_23),
                getString(R.string.head_24),
                getString(R.string.head_25)
        };

        imageResourceID4 = new int[]{
                R.drawable.m1,
                R.drawable.m2,
                R.drawable.m3,
                R.drawable.m4,
                R.drawable.m5,

        };

        for (int i = 0; i < newsHeading4.length; i++) {
            News news = new News(newsHeading4[i], imageResourceID4[i]);
            newsArrayList4.add(news);
        }
        newsArrayList5 = new ArrayList<>();

        newsHeading5 = new String[]{
                getString(R.string.head_26),
                getString(R.string.head_27),
                getString(R.string.head_28),
                getString(R.string.head_29),
                getString(R.string.head_30)
        };

        imageResourceID5 = new int[]{
                R.drawable.nfl1,
                R.drawable.nfl2,
                R.drawable.nfl3,
                R.drawable.nfl4,
                R.drawable.nfl5,

        };

        for (int i = 0; i < newsHeading5.length; i++) {
            News news = new News(newsHeading1[i], imageResourceID5[i]);
            newsArrayList5.add(news);
        }
        newsArrayList6 = new ArrayList<>();

        newsHeading6 = new String[]{
                getString(R.string.head_31),
                getString(R.string.head_32),
                getString(R.string.head_33),
                getString(R.string.head_34),
                getString(R.string.head_35)
        };

        imageResourceID6 = new int[]{
                R.drawable.f1,
                R.drawable.f2,
                R.drawable.f3,
                R.drawable.f4,
                R.drawable.f5,

        };

        for (int i = 0; i < newsHeading6.length; i++) {
            News news = new News(newsHeading6[i], imageResourceID6[i]);
            newsArrayList6.add(news);
        }

        newsArrayList7 = new ArrayList<>();

        newsHeading7 = new String[]{
                getString(R.string.head_36),
                getString(R.string.head_37),
                getString(R.string.head_38),
                getString(R.string.head_39),
                getString(R.string.head_40)
        };

        imageResourceID7 = new int[]{
                R.drawable.e1,
                R.drawable.e2,
                R.drawable.e3,
                R.drawable.e4,
                R.drawable.e5,

        };

        for (int i = 0; i < newsHeading7.length; i++) {
            News news = new News(newsHeading7[i], imageResourceID7[i]);
            newsArrayList7.add(news);
        }
        newsArrayList8 = new ArrayList<>();

        newsHeading8 = new String[]{
                getString(R.string.head_41),
                getString(R.string.head_42),
                getString(R.string.head_43),
                getString(R.string.head_44),
                getString(R.string.head_45)
        };

        imageResourceID8 = new int[]{
                R.drawable.for1,
                R.drawable.for2,
                R.drawable.for3,
                R.drawable.for4,
                R.drawable.for5,

        };

        for (int i = 0; i < newsHeading8.length; i++) {
            News news = new News(newsHeading8[i], imageResourceID8[i]);
            newsArrayList8.add(news);
        }
    }

}
