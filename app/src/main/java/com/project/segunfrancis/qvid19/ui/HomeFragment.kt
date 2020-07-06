package com.project.segunfrancis.qvid19.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.project.segunfrancis.qvid19.R

import com.project.segunfrancis.qvid19.databinding.FragmentHomeBinding

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.readMoreButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_readMoreFragment)
        }
        binding.takeQuizButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_quizFragment)
        }
        return binding.root
    }

}
