package model

class Course(val id: String, val name: String, val credits: Int, val module: Module) {
    override fun toString(): String {
        return (id + "name='" + name + '\'' + ", credits=" + credits + ", module="
                + module + '}')
    }
}