package com.siragus.suriya.config;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;

import java.util.ArrayList;
import java.util.List;

@ChangeLog
public class DatabaseChangeLog {

    @ChangeSet(order = "001", id = "seedDatabase", author = "suriya")
    public void seedDatabase(){
        List<> expenseList = new ArrayList();

    }

}
