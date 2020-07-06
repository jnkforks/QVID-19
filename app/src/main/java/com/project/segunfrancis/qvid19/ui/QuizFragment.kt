package com.project.segunfrancis.qvid19.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.project.segunfrancis.qvid19.databinding.FragmentQuizBinding

/**
 * A simple [Fragment] subclass.
 */
class QuizFragment : Fragment() {

    lateinit var binding: FragmentQuizBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuizBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
}
