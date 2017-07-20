## make.js

make.js 是一个采用 JavaScript 作为描述语言的 Java 项目构建和依赖管理工具。

然而，这只是一个对 Maven|Gradle 的一个包装。在内部，基于 Maven|Gradle 来工作的。也就是说，make.js 根据用 JavaScript 描述的项目信息，生成 Maven 的 pom.xml 或者 Gradle 的 build.gradle 然后把具体的事务交由 Maven|Gradle 来处理。

