package com.example.feelsogood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView; // 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;
    private home_fragment frag1;
    private community_fragment frag2;
    private drugstore_fragment frag3;
    private drugcheck_fragment frag4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //해당 영엉 클릭 시 프레그먼트 이동 함수
        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.str_home:
                        setFrag(0);
                        break;
                    case R.id.str_community:
                        setFrag(1);
                        break;
                    case R.id.str_drug_store:
                        setFrag(2);
                        break;
                    case R.id.str_medicine_check:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });

        frag1=new home_fragment();
        frag2=new community_fragment();
        frag3=new drugstore_fragment();
        frag4=new drugcheck_fragment();
        setFrag(0); // 첫 프래그먼트 화면 지정
    }

    // 프레그먼트 교체 함수 구현
    private void setFrag(int n)
    {
        fm = getSupportFragmentManager();
        ft= fm.beginTransaction();
        switch (n)
        {
            case 0:
                ft.replace(R.id.Main_Frame,frag1);
                ft.commit();
                break;

            case 1:
                ft.replace(R.id.Main_Frame,frag2);
                ft.commit();
                break;

            case 2:
                ft.replace(R.id.Main_Frame,frag3);
                ft.commit();
                break;

            case 3:
                ft.replace(R.id.Main_Frame,frag4);
                ft.commit();
                break;
        }
    }
}
