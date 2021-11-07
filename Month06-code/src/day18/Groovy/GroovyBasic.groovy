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
        println(String.format("\$%.2f",2.234))
        def test = { parameterTypes ->
            if(parameterTypes == true){
                return slurper.data
            }else {
                return slurper.data.size()
            }}
        assert slurper.data.size() == test(false)
        if(!null){
            print('a')
        }


    }
}
