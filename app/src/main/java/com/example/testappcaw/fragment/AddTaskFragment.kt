package com.example.testappcaw.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.coroutineScope
import com.example.testappcaw.R
import com.example.testappcaw.db.Task
import com.example.testappcaw.viewmodel.AddTaskViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class AddTaskFragment : Fragment() {

    companion object {
        fun newInstance() = AddTaskFragment()
    }

    private val viewModel: AddTaskViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_add_task, container, false)
        val subBtn = view.findViewById<Button>(R.id.sub_btn)
        val onlyForMeCB = view.findViewById<CheckBox>(R.id.onlyForMeCB)

        subBtn.setOnClickListener{
            val title = view.findViewById<EditText>(R.id.taskTitle).text.toString()
            val desc = view.findViewById<EditText>(R.id.titleDesc).text.toString()

            Toast.makeText(context, title + desc , Toast.LENGTH_SHORT).show()
            lifecycle.coroutineScope.launch(Dispatchers.Main){
                if (onlyForMeCB.isChecked) {
                    viewModel.insertUser(Task(
                        task = title,
                        desc = desc,
                        status = "pending"
                    ))
                }

            }

        }

        return view
    }
}