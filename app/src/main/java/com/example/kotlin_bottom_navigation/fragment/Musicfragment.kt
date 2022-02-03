package com.example.kotlin_bottom_navigation.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import com.example.kotlin_bottom_navigation.databinding.FragmentMusicBinding

class Musicfragment :Fragment() {


    private var mBinding : FragmentMusicBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mBinding  = FragmentMusicBinding.inflate(inflater, container, false)


        return mBinding?.root

    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}