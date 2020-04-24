package me.ntrrgc.tsGenerator.tests

sealed class SealedClass

data class ClassA(val p:String):SealedClass()

data class ClassB(val p:Int):SealedClass()

data class KotlinSealedClass(val field: SealedClass)