#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.client.local.widget;

import com.google.gwt.user.client.ui.Composite;
import gwt.material.design.client.ui.MaterialContainer;
import org.jboss.errai.ui.shared.api.annotations.DataField;
import org.jboss.errai.ui.shared.api.annotations.Templated;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Templated
public class Main extends Composite {

    @Inject
    @DataField
    MaterialContainer container;

    @PostConstruct
    public void init() {

    }

    public MaterialContainer getContainer() {
        return container;
    }
}
