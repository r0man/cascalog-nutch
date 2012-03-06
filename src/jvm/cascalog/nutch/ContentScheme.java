package cascalog.nutch;

import cascading.tuple.Fields;

public class ContentScheme extends NutchScheme {

    private static final long serialVersionUID = 1L;

    public ContentScheme() {
        super(new Fields("url", "content"));
    }

}
