package app.query.kotlin.query

import app.query.kotlin.query.data.QueryData


fun <T> Any.useQuery(key:String,  function: ()->T): QueryData {
    val data=QueryData()
    data.isExecuting=true

    var result= function.invoke()
    data.result=result
    data.isExecuting=false

    return data
}

fun <T> asList(vararg ts: ()->T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t.invoke())
    return result
}