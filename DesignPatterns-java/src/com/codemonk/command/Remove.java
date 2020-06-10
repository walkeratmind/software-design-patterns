package com.codemonk.command;

import com.codemonk.command.fx.Command;

/**
 * -----------------------------------------------------------------------------
 * - Author: Rakesh Niraula
 * - Date: Friday, 05-June-2020
 * - Copyright(c): Codemonk 2020. All rights reserved.
 * -----------------------------------------------------------------------------
 **/

public class Remove implements Command {
    @Override
    public void execute() {
        System.out.println("Remove");
    }
}
