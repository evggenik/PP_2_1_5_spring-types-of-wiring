package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    @Autowired
    @Qualifier("island2") // 2 бина могут быть связаны island2 и getIsland, поэтому уточняем какой будем связывать
    private Island2 island;

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}
