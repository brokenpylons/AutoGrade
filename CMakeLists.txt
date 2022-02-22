cmake_minimum_required(VERSION 3.13)
project(task)

add_executable(task task.cpp)
set_property(TARGET task PROPERTY CXX_STANDARD 20)

configure_file(${CMAKE_SOURCE_DIR}/test.sh ${CMAKE_CURRENT_BINARY_DIR}/test.sh COPYONLY)
