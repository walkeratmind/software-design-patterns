package com.codemonk.command;

import com.codemonk.command.fx.Button;
import com.codemonk.command.fx.Command;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Demo {
    public static void show() {
//        CustomerService service = new CustomerService();
//        Command command = new AddCustomerCommand(service);
//        var button = new Button(command);
//        button.click();
        var composite = new CompositeCommand();
        composite.add(new AddCustomerCommand(new CustomerService()));
        composite.add(new ResizeCommand());
        composite.add(new Remove());

        composite.execute();
    }
    public static void main(String[] args) {
        show();
    }
}
