package app.query.kotlin.query

import app.query.kotlin.query.data.QueryData


fun Any.useQuery(key:String, function:()-> Any?): QueryData {
    val data=QueryData()
    data.isExecuting=true

    var result= function.invoke()
    data.result=result
    data.isExecuting=false

    return data
}