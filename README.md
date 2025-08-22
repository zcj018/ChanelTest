# ChanelTest
A demo to test channel and go in clojure.core.async 
1. process-orders test :
   
"C:\Program Files\Java\jdk1.8.0_131\bin\java.exe" -XX:-OmitStackTraceInFastThrow -Dclojure.basis=D:\repository\DepsChannelTest\.cpcache\9D8E766905D7BEF9F10D59137DCD8283.basis "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=51885" -Dfile.encoding=UTF-8 -classpath src;C:\Users\chaojie\.m2\repository\org\clojure\clojure\1.11.1\clojure-1.11.1.jar;C:\Users\chaojie\.m2\repository\org\clojure\core.async\1.3.610\core.async-1.3.610.jar;C:\Users\chaojie\.m2\repository\org\clojure\core.specs.alpha\0.2.62\core.specs.alpha-0.2.62.jar;C:\Users\chaojie\.m2\repository\org\clojure\spec.alpha\0.3.218\spec.alpha-0.3.218.jar;C:\Users\chaojie\.m2\repository\org\clojure\tools.analyzer.jvm\1.1.0\tools.analyzer.jvm-1.1.0.jar;C:\Users\chaojie\.m2\repository\org\clojure\core.memoize\1.0.236\core.memoize-1.0.236.jar;C:\Users\chaojie\.m2\repository\org\clojure\tools.analyzer\1.0.0\tools.analyzer-1.0.0.jar;C:\Users\chaojie\.m2\repository\org\clojure\tools.reader\1.3.2\tools.reader-1.3.2.jar;C:\Users\chaojie\.m2\repository\org\ow2\asm\asm\5.2\asm-5.2.jar;C:\Users\chaojie\.m2\repository\org\clojure\core.cache\1.0.207\core.cache-1.0.207.jar;C:\Users\chaojie\.m2\repository\org\clojure\data.priority-map\1.0.0\data.priority-map-1.0.0.jar clojure.main -m solution
WARNING: update-vals already refers to: #'clojure.core/update-vals in namespace: clojure.tools.analyzer.utils, being replaced by: #'clojure.tools.analyzer.utils/update-vals
WARNING: update-keys already refers to: #'clojure.core/update-keys in namespace: clojure.tools.analyzer.utils, being replaced by: #'clojure.tools.analyzer.utils/update-keys
WARNING: update-vals already refers to: #'clojure.core/update-vals in namespace: clojure.tools.analyzer, being replaced by: #'clojure.tools.analyzer.utils/update-vals
WARNING: update-keys already refers to: #'clojure.core/update-keys in namespace: clojure.tools.analyzer, being replaced by: #'clojure.tools.analyzer.utils/update-keys
WARNING: update-vals already refers to: #'clojure.core/update-vals in namespace: clojure.tools.analyzer.passes, being replaced by: #'clojure.tools.analyzer.utils/update-vals
WARNING: update-vals already refers to: #'clojure.core/update-vals in namespace: clojure.tools.analyzer.passes.uniquify, being replaced by: #'clojure.tools.analyzer.utils/update-vals
print tasks: #object[clojure.core$_PLUS_ 0x68ea1eb5 clojure.core$_PLUS_@68ea1eb5] (#object[clojure.core.async.impl.channels.ManyToManyChannel 0x6046fba0 clojure.core.async.impl.channels.ManyToManyChannel@6046fba0] #object[clojure.core.async.impl.channels.ManyToManyChannel 0x248ba4fc clojure.core.async.impl.channels.ManyToManyChannel@248ba4fc] #object[clojure.core.async.impl.channels.ManyToManyChannel 0x54cce500 clojure.core.async.impl.channels.ManyToManyChannel@54cce500] #object[clojure.core.async.impl.channels.ManyToManyChannel 0x755033c5 clojure.core.async.impl.channels.ManyToManyChannel@755033c5] #object[clojure.core.async.impl.channels.ManyToManyChannel 0x229c4d34 clojure.core.async.impl.channels.ManyToManyChannel@229c4d34] #object[clojure.core.async.impl.channels.ManyToManyChannel 0x5b49b1df clojure.core.async.impl.channels.ManyToManyChannel@5b49b1df])
Processed order: {:id 2, :amount 200, :status processed}
Processed order: {:id 6, :amount 600, :status processed}
Processed order: {:id 4, :amount 400, :status processed}
Processed order: {:id 3, :amount 300, :status processed}
Processed order: {:id 1, :amount 100, :status processed}
Processed order: {:id 5, :amount 500, :status processed}
All orders processed.

2. process-orders-in-sequence test :

"C:\Program Files\Java\jdk1.8.0_131\bin\java.exe" -XX:-OmitStackTraceInFastThrow -Dclojure.basis=D:\repository\DepsChannelTest\.cpcache\9D8E766905D7BEF9F10D59137DCD8283.basis "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=51977" -Dfile.encoding=UTF-8 -classpath src;C:\Users\chaojie\.m2\repository\org\clojure\clojure\1.11.1\clojure-1.11.1.jar;C:\Users\chaojie\.m2\repository\org\clojure\core.async\1.3.610\core.async-1.3.610.jar;C:\Users\chaojie\.m2\repository\org\clojure\core.specs.alpha\0.2.62\core.specs.alpha-0.2.62.jar;C:\Users\chaojie\.m2\repository\org\clojure\spec.alpha\0.3.218\spec.alpha-0.3.218.jar;C:\Users\chaojie\.m2\repository\org\clojure\tools.analyzer.jvm\1.1.0\tools.analyzer.jvm-1.1.0.jar;C:\Users\chaojie\.m2\repository\org\clojure\core.memoize\1.0.236\core.memoize-1.0.236.jar;C:\Users\chaojie\.m2\repository\org\clojure\tools.analyzer\1.0.0\tools.analyzer-1.0.0.jar;C:\Users\chaojie\.m2\repository\org\clojure\tools.reader\1.3.2\tools.reader-1.3.2.jar;C:\Users\chaojie\.m2\repository\org\ow2\asm\asm\5.2\asm-5.2.jar;C:\Users\chaojie\.m2\repository\org\clojure\core.cache\1.0.207\core.cache-1.0.207.jar;C:\Users\chaojie\.m2\repository\org\clojure\data.priority-map\1.0.0\data.priority-map-1.0.0.jar clojure.main -m solution
WARNING: update-vals already refers to: #'clojure.core/update-vals in namespace: clojure.tools.analyzer.utils, being replaced by: #'clojure.tools.analyzer.utils/update-vals
WARNING: update-keys already refers to: #'clojure.core/update-keys in namespace: clojure.tools.analyzer.utils, being replaced by: #'clojure.tools.analyzer.utils/update-keys
WARNING: update-vals already refers to: #'clojure.core/update-vals in namespace: clojure.tools.analyzer, being replaced by: #'clojure.tools.analyzer.utils/update-vals
WARNING: update-keys already refers to: #'clojure.core/update-keys in namespace: clojure.tools.analyzer, being replaced by: #'clojure.tools.analyzer.utils/update-keys
WARNING: update-vals already refers to: #'clojure.core/update-vals in namespace: clojure.tools.analyzer.passes, being replaced by: #'clojure.tools.analyzer.utils/update-vals
WARNING: update-vals already refers to: #'clojure.core/update-vals in namespace: clojure.tools.analyzer.passes.uniquify, being replaced by: #'clojure.tools.analyzer.utils/update-vals
Processed order: {:id 1, :amount 100, :status processed}
Processed order: {:id 2, :amount 200, :status processed}
Processed order: {:id 3, :amount 300, :status processed}
Processed order: {:id 4, :amount 400, :status processed}
Processed order: {:id 5, :amount 500, :status processed}
Processed order: {:id 6, :amount 600, :status processed}
All orders processed.

