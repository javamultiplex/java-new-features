# Java new features

## Java 8

- Introduction of functional programming
- Functional Interfaces
  - Consumer
  - BiConsumer
  - Supplier
  - Function
  - BiFunction
  - Predicate
  - BiPredicate
- Interface
  - default method
  - static method
- Stream API
  - stream()
  - parallelStream()
  - filter()
  - map()
  - forEach()
  - collect()
    - Collectors
       - toList()
       - toMap()
       - toSet()
       - groupingBy()
       - mapping()
       - joining()
- Lambda Functions
- Enhancements in Date/Time API
- StringJoiner
- String
  - join()

## Java 9

- private method inside Interface
- effective final with try-with-resource -> resource as dependency can be passed as an argument in try(resource). No need to say try(Resource resource = new Resource)
- variable with name underscore ( _ ) not allowed now
- String
  - chars()
  - codePoints()
- Stream
    - takeWhile(Predicate) -> It is like door open now and close in future
    - dropWhile(Predicate) -> It is like door close now and open in future
- IntStream iterate()
   - with bounds
   - without bounds
- Optional
   - ifPresentOrElse() -> It is new method to get Optional value
   - or()
   - stream()
- Collectors
   - filtering()
   - flatMapping()
- CompletableFuture
   - completeOnTimeout()
   - orTimeout() 
- List.of(), Set.of(), Map.of() methods to create immutable collections
- Annonymous inner class with diamond <> operator
- JShell -> REPL(Read Evaluate Print Loop) for java
- Modules


## Java 10

- local variable type inference using var
  - var can't be used as method parameter and return type.
  - var can't be used as class level attributes
  - null can't be assigned to var
- Optional
  - orElseThrow()
- Collectors
  - toUnmodifiableList()
  - toUnmodifiableSet()
  - toUnmodifiableMap()
- List.copyOf(), Set.copyOf() and Map.copyOf() methods

## Java 11

- var for lambda local variables
- Optional.empty()
- Files
  - readString(Path)
  - writeString(Path)
- Predicate
  - not()
- String
  - repeat(int) - Repeats the String as many times as provided by the int parameter
  - lines() - Uses a Spliterator to lazily provide lines from the source string
  - isBlank() - Indicates if the String is empty or contains only white space characters
  - stripLeading() - Removes the white space from the beginning
  - stripTrailing() - Removes the white space from the end
  - strip() - Removes the white space from both, beginning and the end of string
    - Difference between trim() and strip()? - https://stackoverflow.com/questions/51266582/difference-between-string-trim-and-strip-methods-in-java-11

## Java 12
  -  Switch Expressions (Introduced as Experimental and went live as part of Java 14)
  -  Collectors
     - teeing()
  - String
    - indent()
    - transform()
 
## Java 13
  -  Text Block (Introduced as Experimental and went live as part of Java 15) -> multi line strings with """ ---------  """ 


## References

- https://www.youtube.com/watch?v=oRcOiGWK9Ts
