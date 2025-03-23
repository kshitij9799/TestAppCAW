package com.example.testappcaw.fragment

import androidx.fragment.app.viewModels
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.testappcaw.viewmodel.CompletedTaskViewModel
import com.example.testappcaw.R

class CompletedTaskFragment : Fragment() {

    companion object {
        fun newInstance() = CompletedTaskFragment()
    }

    private val viewModel: CompletedTaskViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // TODO: Use the ViewModel
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_completed_task, container, false)
    }
}