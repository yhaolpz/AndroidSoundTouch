# AndroidSoundTouch
Android端集成SoundTouch实现变声

https://www.jianshu.com/p/d8eb79d71285


## 1.将 soundtouch 源码及 JNISoundTouch.java 拷贝到合适的位置，自行修正相关路径

## 2.在你应用根目录的 CMakeLists.txt 中引用 soundtouch 下的 CMakeLists.txt，像这样：

  add_subdirectory(${CMAKE_SOURCE_DIR}/src/main/cpp/soundtouch)

