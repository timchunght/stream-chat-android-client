package io.getstream.chat.android.client.api.models

interface CustomObject {
    var extraData: MutableMap<String, Any>

    @Suppress("UNCHECKED_CAST")
    fun <T> getExtraValue(key: String, default: T): T {
        return if (extraData.containsKey(key)) {
            extraData[key] as T
        } else {
            default
        }
    }

    fun putExtraValue(key: String, value: Any) {
        extraData[key] = value
    }
}