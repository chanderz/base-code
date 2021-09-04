package day18.Groovy

import groovy.json.JsonSlurper

class GroovyBasic {
    static void main(String[] args){
        //print Hello World
        /*
        multiple line comments
         */

        def list = '''{
                "success":"true",
                "data":"{'name':'test','content':'customized page'}"
        }'''
        def slurper = new JsonSlurper().parseText(list);
        println(slurper.getClass());
        println(slurper.data);
        println(slurper.size());
        println(slurper.data.size())


    }
}
