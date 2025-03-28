package com.example.testappcaw.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testappcaw.db.Task
import com.example.testappcaw.R
import com.example.testappcaw.activity.MainActivity
import com.example.testappcaw.fragment.EditDialogFragment
import com.example.testappcaw.model.ForAllTask

class TaskAdapter(
    private val context: Context,
    private val taskList: List<Task>?,
    private val onlineTaskList : List<ForAllTask>?,
    private val isOnlineTaskList : Boolean
) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TaskViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        if (isOnlineTaskList) {
            holder.titleTxt.text = onlineTaskList?.get(position)?.todo
//            holder.descText.text = onlineTaskList?.get(position)?.completed
        }
        else {
            holder.titleTxt.text = taskList?.get(position)?.task
            holder.descText.text = taskList?.get(position)?.desc
            with(holder){
                ivEdit.setOnClickListener {
                    val editDialogFragment =  EditDialogFragment(taskList!![position])
                    editDialogFragment.show((context as MainActivity).supportFragmentManager, "editDialog")
                }
            }
        }
    }

    override fun getItemCount(): Int {
        if (isOnlineTaskList) {
            return onlineTaskList?.size ?: 0
        }
        return if (taskList.isNullOrEmpty()) 0 else taskList.size
    }

    inner class TaskViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleTxt = view.findViewById<TextView>(R.id.titleTxt)
        val descText = view.findViewById<TextView>(R.id.descText)
        val ivEdit = view.findViewById<ImageView>(R.id.iv_edit)
    }
}