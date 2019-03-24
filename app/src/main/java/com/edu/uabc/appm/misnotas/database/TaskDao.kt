package com.edu.uabc.appm.misnotas.database

import android.arch.persistence.room.*
import com.edu.uabc.appm.misnotas.MisNotasApp
import org.jetbrains.anko.doAsync


    @Dao
    interface TaskDao {
        @Query("SELECT * FROM task_entity")
        fun getAllTasks(): MutableList<TaskEntity>

        @Insert
        fun addTask(taskEntity : TaskEntity):Long

        @Query("SELECT * FROM task_entity where id like :id")
        fun getTaskById(id: Long): TaskEntity

        @Update
        fun updateTask(taskEntity: TaskEntity):Int

        @Delete
        fun deleteTask(taskEntity: TaskEntity):Int
    }
