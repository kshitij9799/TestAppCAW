package com.example.testappcaw.fragment

import androidx.fragment.app.viewModels
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.coroutineScope
import com.example.testappcaw.viewmodel.CompletedTaskViewModel
import com.example.testappcaw.R
import com.example.testappcaw.adapters.TaskAdapter
import com.example.testappcaw.databinding.FragmentCompletedTaskBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class CompletedTaskFragment : Fragment() {

    lateinit var binding: FragmentCompletedTaskBinding

    companion object {
        fun newInstance() = CompletedTaskFragment()
    }

    private val viewModel: CompletedTaskViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCompletedTaskBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.allCompletedTasks.observe(viewLifecycleOwner){
            Log.d("checkdata", "onCreateView: $it")
            lifecycle.coroutineScope.launch(Dispatchers.Main){
                binding.completedRecycler.adapter = TaskAdapter(requireActivity(),it, null, false)
            }
        }

    }
}