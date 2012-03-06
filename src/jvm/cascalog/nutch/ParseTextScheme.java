package cascalog.nutch;

import cascading.tuple.Fields;

public class ParseTextScheme extends NutchScheme {

    private static final long serialVersionUID = 1L;

    public ParseTextScheme() {
        super(new Fields("url", "parse-text"));
    }

}
