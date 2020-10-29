

# ComposedAnyOfInlineValidation

## anyOf schemas
* [Long](Long.md)

## Example
```java
// Import classes:
import org.openapitools.client.model.ComposedAnyOfInlineValidation;
import org.openapitools.client.model.Long;

public class Example {
    public static void main(String[] args) {
        ComposedAnyOfInlineValidation exampleComposedAnyOfInlineValidation = new ComposedAnyOfInlineValidation();

        // create a new Long
        Long exampleLong = new Long();
        // set ComposedAnyOfInlineValidation to Long
        exampleComposedAnyOfInlineValidation.setActualInstance(exampleLong);
        // to get back the Long set earlier
        Long testLong = (Long) exampleComposedAnyOfInlineValidation.getActualInstance();
    }
}
```


