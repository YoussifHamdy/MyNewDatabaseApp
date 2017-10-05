package com.example.dell.mynewdatabaseapp;

/**
 * Created by Dell on 9/29/2017.
 */

public class Tasks {

    private int _id;
    private String _taskname;


    public void Tasks(){          // Empty constructor


    }


    public Tasks(String taskname){      //creating parameter
        this._taskname=taskname;

    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_taskname() {
        return _taskname;
    }

    public void set_taskname(String _taskname) {
        this._taskname = _taskname;
    }


}
