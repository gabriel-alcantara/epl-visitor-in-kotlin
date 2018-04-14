# Epl visitor in kotlin
Mini projeto da disciplina Técnicas de Programação 2, que consiste na implementação que usa recursos de modularização de features incluindo o testes automatizados de BDD.

Esta implementação foi baseada em mixin-layers (Scala Traits) para fazer epl visitor.

A principio houve uma tentativa de fazer a implementação utilizando a estratégia de aspects(aop) utilizando kotlin-spring, e uma das formas que encontrei de utilizar o aspect com kotlin seria:

```
package com.example.aspect

import android.util.Log
import android.widget.EditText
import com.example.aspect.R
import com.example.aspect.LoginActivity
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect

@Aspect
class PrefillAspect {

    @After("execution(* com.example.aspect.LoginActivity.onCreate(*))")
    fun prefillLoginForm(joinPoint: JoinPoint) {
        try {
            val activity = joinPoint.target as LoginActivity
            activity.findViewById<EditText>(R.id.editEmail).setText("test@example.com")
            activity.findViewById<EditText>(R.id.editPassword).setText("MySecretPassword")
        } catch (e: Throwable) {
            Log.e("PrefillAspect", "prefillLoginForm: failed")
        }
    }

}
```

Entretando, ainda não consegui fazer a implementação de aop no mini projeto do epl, sendo essa uma oportunidade de implementar em futuros trabalhos.

A implementação do epl com mixin traits em kotlin é bem parecida com a fornecida em scala, uma de suas diferença é que usamos a notação de interface em kotlin ao invés de traits.

Para implementação dos testes automatizados em kotlin foi utilizado as seguintes depedências.

```
<dependencies>
        <dependency>
            <groupId>com.winterbe</groupId>
            <artifactId>expekt</artifactId>
            <version>0.5.0</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>RELEASE</version>
        </dependency>
    </dependencies>
```
