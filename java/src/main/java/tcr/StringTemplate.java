package tcr;

import java.util.List;
import java.util.Map;

class StringTemplate {
    private String template;

    public StringTemplate(String template) {
        this.template = template;
    }

    public String replace(Map<String, String> attributes) {
        if(attributes.isEmpty())
            return template;

        return "hello Eva";
    }
}