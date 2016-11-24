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
package ${package}.client.local;

import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.RootPanel;
import ${package}.client.local.resources.AppClientBundle;
import ${package}.client.local.widget.Header;
import ${package}.client.local.widget.Main;
import ${package}.client.local.widget.SideNav;
import org.jboss.errai.ioc.client.api.EntryPoint;
import org.jboss.errai.ui.nav.client.local.Navigation;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@EntryPoint
public class Client extends Composite{

    @Inject
    Navigation navigation;

    @Inject
    Header header;

    @Inject
    SideNav sideNav;

    @Inject
    Main content;

    @PostConstruct
    public void init() {
        StyleInjector.inject(AppClientBundle.INSTANCE.appCss().getText());
        content.getContainer().add(navigation.getContentPanel());
        RootPanel.get().add(header);
        RootPanel.get().add(sideNav);
        RootPanel.get().add(content);
    }
}
