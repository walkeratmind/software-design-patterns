package com.codemonk.template;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Demo {
    public static void show() {
        TransferMoneyTask task = new TransferMoneyTask();
        task.execute();

        var generateReportTask = new GenerateReportTask();
        generateReportTask.execute();
    }
    public static void main(String[] args) {
        show();
    }
}
