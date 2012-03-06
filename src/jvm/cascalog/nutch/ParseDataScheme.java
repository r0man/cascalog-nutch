package cascalog.nutch;

import cascading.tuple.Fields;

public class ParseDataScheme extends NutchScheme {

    private static final long serialVersionUID = 1L;

    public ParseDataScheme() {
        super(new Fields("url", "parse-data"));
    }

}
