package com.project.segunfrancis.qvid19.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.project.segunfrancis.qvid19.R
import com.project.segunfrancis.qvid19.databinding.FragmentReadMoreBinding

/**
 * A simple [Fragment] subclass.
 */
class ReadMoreFragment : Fragment() {

    lateinit var binding: FragmentReadMoreBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentReadMoreBinding.inflate(inflater, container, false)
        return binding.root
    }
}
