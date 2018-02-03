/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2016 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.local.widget;

import com.google.gwt.user.client.ui.Composite;
import com.google.inject.Inject;
import gwt.material.design.client.constants.IconType;
import gwt.material.design.client.constants.SideNavType;
import gwt.material.design.client.ui.MaterialLink;
import gwt.material.design.client.ui.MaterialSideNavPush;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;

@Templated
public class SideNav extends Composite {

    @Inject
    @DataField
    MaterialSideNavPush sideNav;

    @PostConstruct
    protected void init() {
        sideNav.setId("sideNav");
        sideNav.setWidth(280);
        sideNav.reload();
        for (int i = 1; i <= 3; i++) {
            MaterialLink link = new MaterialLink("Item " + i);
            link.setIconType(IconType.POLYMER);
            sideNav.add(link);
        }
    }
}
