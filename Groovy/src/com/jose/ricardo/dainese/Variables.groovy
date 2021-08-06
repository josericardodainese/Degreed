package com.jose.ricardo.dainese

class Variables {

    static void main(String[] args) {
        def name =  "Jose"
        /* groovy is dynamically type */
        name = 20
        println(name)
        println 'Name is ' + name
        println "Name is ${name}"

        def x = 10
        def X = 21

        /* groovy is case sensitive */
        println(x)
        println(X)

        /* groovy is multi assignments */
        def (String a, int b, int c) = [100, 200, 301]

        println(a)
        println(b)
        println(c)

    }

}
