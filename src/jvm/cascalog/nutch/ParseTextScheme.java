package cascalog.nutch;

import cascading.tuple.Fields;
import cascading.tuple.Tuple;

public class ParseTextScheme extends NutchScheme {

    private static final long serialVersionUID = 1L;

    public ParseTextScheme() {
        super(new Fields("url", "parse-text"));
    }

    @Override
    public Tuple source(Object key, Object value) {
        Tuple tuple = new Tuple();
        tuple.add(key.toString());
        tuple.add(value.toString());
        return tuple;
    }

}
