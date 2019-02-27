cmake_minimum_required(VERSION 3.4.1)

#获取当前目录
set(pwd_dir ${CMAKE_SOURCE_DIR}/src/main/cpp)
#设置库名称
set(lib_name soundtouch)
#设置头文件
set(include_dir
        ${pwd_dir}
        ${pwd_dir}/include
        )
#将若干库链接到目标库文件
set(link_lib
        log
        )
#设置编译选项
set(cmake_c_flag_debug

        )
set(cmake_cxx_flag_debug

        )
#设置要编译的源文件
set(source_files
        ${pwd_dir}/soundtouch/soundtouch_wapper.cpp
        ${pwd_dir}/soundtouch/AAFilter.cpp
        ${pwd_dir}/soundtouch/BPMDetect.cpp
        ${pwd_dir}/soundtouch/cpu_detect_x86.cpp
        ${pwd_dir}/soundtouch/FIFOSampleBuffer.cpp
        ${pwd_dir}/soundtouch/FIRFilter.cpp
        ${pwd_dir}/soundtouch/mmx_optimized.cpp
        ${pwd_dir}/soundtouch/PeakFinder.cpp
        ${pwd_dir}/soundtouch/RateTransposer.cpp
        ${pwd_dir}/soundtouch/SoundTouch.cpp
        ${pwd_dir}/soundtouch/sse_optimized.cpp
        ${pwd_dir}/soundtouch/TDStretch.cpp
        )

#其他配置


#以下为固定语法，无需修改

include_directories(${include_dir})
set(CMAKE_C_FLAGS_DEBUG "${cmake_c_flag_debug} -s")
set(CMAKE_CXX_FLAGS_DEBUG "${cmake_cxx_flag_debug} -s")
add_library(${lib_name} SHARED ${source_files})
target_link_libraries(${lib_name} ${link_lib})