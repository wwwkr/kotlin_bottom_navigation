package com.example.kotlin_bottom_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.kotlin_bottom_navigation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var mBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        //네비게이션들을 담는 호스트
        val navHostFramgent = supportFragmentManager.findFragmentById(R.id.my_nav_host) as NavHostFragment

        //네비게이션 컨트롤러
        val navController = navHostFramgent.navController

        //바텀 네비게이션 뷰 과 네비게이션을 묶어준다

        NavigationUI.setupWithNavController(mBinding.myBottomNav,navController)



    }
}