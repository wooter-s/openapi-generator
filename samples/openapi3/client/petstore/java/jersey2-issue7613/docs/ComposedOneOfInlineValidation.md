

# ComposedOneOfInlineValidation

## oneOf schemas
* [Long](Long.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.ComposedOneOfInlineValidation;
import org.openapitools.client.model.Long;

public class Example {
    public static void main(String[] args) {
        ComposedOneOfInlineValidation exampleComposedOneOfInlineValidation = new ComposedOneOfInlineValidation();

        // create a new Long
        Long exampleLong = new Long();
        // set ComposedOneOfInlineValidation to Long
        exampleComposedOneOfInlineValidation.setActualInstance(exampleLong);
        // to get back the Long set earlier
        Long testLong = (Long) exampleComposedOneOfInlineValidation.getActualInstance();
    }
}
```


