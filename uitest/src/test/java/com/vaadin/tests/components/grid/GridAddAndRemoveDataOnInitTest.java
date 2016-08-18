/*
 * Copyright 2000-2016 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.tests.components.grid;

import org.junit.Assert;
import org.junit.Test;

import com.vaadin.testbench.By;
import com.vaadin.testbench.elements.GridElement;
import com.vaadin.testbench.parallel.TestCategory;
import com.vaadin.tests.tb3.MultiBrowserTest;

@TestCategory("grid")
public class GridAddAndRemoveDataOnInitTest extends MultiBrowserTest {

    @Test
    public void verifyGridSizes() {
        openTestURL();

        GridElement gridAdd = $(LegacyGridElement.class).first();
        if (!gridAdd.isElementPresent(By.vaadin("#cell[9][0]"))
                || gridAdd.isElementPresent(By.vaadin("#cell[10][0]"))) {
            Assert.fail("Grid with added data contained incorrect rows");
        }

        GridElement gridRemove = $(LegacyGridElement.class).get(1);
        if (!gridRemove.isElementPresent(By.vaadin("#cell[4][0]"))
                || gridRemove.isElementPresent(By.vaadin("#cell[5][0]"))) {
            Assert.fail("Grid with removed data contained incorrect rows");
        }
    }

}
