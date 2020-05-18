package com.example.feelsogood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class community_fragment extends Fragment // Fragment 클래스를 상속받아야한다
{

    private View view;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.community_fragment,container,false);

        ImageView imageView = (ImageView)view.findViewById(R.id.imageview);
        ImageView imageView2 = (ImageView)view.findViewById(R.id.imageview2);
        ImageView imageView3 = (ImageView)view.findViewById(R.id.imageview3);
        TextView textView = (TextView)view.findViewById(R.id.textview);

//         drawable에 있는 이미지를 지정합니다.
        imageView.setImageResource(R.drawable.community_1);
        imageView2.setImageResource(R.drawable.community_2);

        imageView3.getLayoutParams().height=100;
        imageView3.getLayoutParams().width=100;
        imageView3.setImageResource(R.drawable.profile_image);

        textView.setText("Pill So Good");

        return view;
    }
}