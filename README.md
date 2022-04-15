# Java new features

## Java 8 (LTS)

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
- JPMS (Java Platform Module System)
  - Types of modules
    - unnamed modules
    - automatic modules
    - named modules
  - jdeps
  - jmods
  - Modular Jar
  - Module Path
  - Module Declaration (module-info.java)
     - module (modulename){}
     - requires [static] [transitive] (module)
     - exports (package) [to] [module]
     - opens (package) [to] [module]
     - open module (moduelname) {}
     - provides (service) with (implementation)
     - uses (service)
   - Module Descriptor (module-info.class)
   - jdeps -jdkinternals [jar] (command to validate java internal api usage in jar)
 - Java Linker
   - jlink

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

## Java 11 (LTS)

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
  -  Switch Expressions (Preview)
  -  Collectors
     - teeing()
  - String
    - indent()
    - transform()
 
## Java 13
  -  Text Block (Preview)
     - multi line strings with """ ---------  """ 
     - No need to escape
     - Smart Indentations
     - Trailing space handling
     - New escapes
       - \
       - \s
     - formating
       - replace(), replaceAll()
       - String.format()
  - Switch Expressions (Second Preview)
## Java 14
  - Switch Expressions (Live)
  - Java Records (Preview)
    - data classes 
    - By default record is final and all properties are final (Immutable)
    - Implements interfaces but can't extends classes
    - No default constructor
    - no setter method available
    - toString() method avaialble by default
    - Adding a canonical constructors
    - Adding methods
    - Adding local records inside function
  - Pattern Matching for **instanceof** (Preview)
  - Helpful NullPointerExceptions (-XX:+ShowCodeDetailsInExceptionMessages)
  - Text Block (Second Preview)

## Java 15
   - Text Block (Live)
   - Sealed classes (Preview)
   - Local Class, Interface, Enum and Record (Preview)
   - Pattern Matching for **instanceOf** (Second Preview) 
   - Java Records (Second Preview)
      - We can use annotations on top of Record
      - We can implement sealed interface

## Java 16
   - Java Records (Live)
   - Add InvocationHandler::invokeDefault Method for Proxy's Default Method Support
   - Stream.toList()
   - Pattern Matching for **instanceOf** (Live) 
   - Sealed classes (Second Preview)
   - Find Period-of-day using ```DateTimeFormatter.ofPattern("B").format(LocalDateTime.now())```

## Java 17 (LTS)
   - Pattern Matching for switch expressions (Preview)
   - Sealed classes (Live)

## Java 18
   - UTF-8 by default in all java apis
   - Code Snippets in Java Documentation
     -   {@snippet :
            final SnippetExample instance = SnippetExample.newInstance(); // @highlight substring="newInstance"
            instance.processIt();
         }
   - Minimal web server
     - ```jwebserver```
     - Supports only HTTP protocol
     - Serve only static contents
     - Serve static content from specific folder
   - Pattern Matching for switch expressions (Second Preview)
     - Guarded Pattern
     - Null matching

## References

- https://www.youtube.com/watch?v=oRcOiGWK9Ts
- https://www.youtube.com/watch?v=lBOwPYvdvLQ
- https://www.youtube.com/watch?v=jGuDzW85FPI&list=PLEocw3gLFc8VHoA_OgHN1q6Zd-r-q-dvU&index=1
- https://www.youtube.com/watch?v=HeRZRGdvyL4&list=PLEocw3gLFc8VHoA_OgHN1q6Zd-r-q-dvU&index=2
- https://www.youtube.com/watch?v=Xkb6QdljWhA&list=PLEocw3gLFc8VHoA_OgHN1q6Zd-r-q-dvU&index=3
- https://www.youtube.com/watch?v=J1YKAFtNz70&list=PLEocw3gLFc8VHoA_OgHN1q6Zd-r-q-dvU&index=9
- https://www.youtube.com/watch?v=FgGmnMq3UqE&list=PLEocw3gLFc8VHoA_OgHN1q6Zd-r-q-dvU&index=15
- https://www.youtube.com/watch?v=cHmHrZZQWNc&list=PLEocw3gLFc8VHoA_OgHN1q6Zd-r-q-dvU&index=16
- https://www.youtube.com/watch?v=JGZH_2Phy58&list=PLEocw3gLFc8VHoA_OgHN1q6Zd-r-q-dvU&index=17
- https://www.youtube.com/watch?v=I7H8xaSBRIk&list=PLEocw3gLFc8VHoA_OgHN1q6Zd-r-q-dvU&index=18
- https://www.youtube.com/watch?v=qBTBgSviBG4&list=PLEocw3gLFc8VHoA_OgHN1q6Zd-r-q-dvU&index=31
- https://www.youtube.com/watch?v=22lDKofzkk0&list=PLEocw3gLFc8VHoA_OgHN1q6Zd-r-q-dvU&index=36
- https://www.youtube.com/watch?v=xzc8Hug0o5A
- https://www.youtube.com/watch?v=Yacu1yUktjY
- https://www.youtube.com/watch?v=Xkh5sa3vjTE
- https://www.youtube.com/watch?v=5GfE1-vEl1A

