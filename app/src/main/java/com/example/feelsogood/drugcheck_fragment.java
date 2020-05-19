package com.example.feelsogood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class drugcheck_fragment extends Fragment // Fragment 클래스를 상속받아야한다
{

    private View view;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.drugcheck_fragment,container,false);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageview);
        ImageView imageView2 = (ImageView)view.findViewById(R.id.imageview2);
        ImageView imageView3 = (ImageView)view.findViewById(R.id.imageview3);
        ImageView imageView4 = (ImageView)view.findViewById(R.id.imageview4);
        ImageView imageView5 = (ImageView)view.findViewById(R.id.imageview5);

        imageView.getLayoutParams().height=100;
        imageView.getLayoutParams().width=100;


        imageView.setImageResource(R.drawable.profile_image);
        imageView2.setImageResource(R.drawable.pill_check_1);
        imageView3.setImageResource(R.drawable.pill_check_2);
        imageView4.setImageResource(R.drawable.pill_check_3);
        imageView5.setImageResource(R.drawable.pill_check_4);

        return view;
    }
}