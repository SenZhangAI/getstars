#include <iostream>
//关键在于让编译器include到此地址
//简单的方式是： ln -s /home/Sen/eigen3.3.2 /usr/local/include
//将eigen3.3.2中的文件链接到/usr/local/include “目录”中
//可通过 g++ -v 或 clang++ -v (verbose)查看详细过程
//注意这里用了<...> 而不是"..."
#include <Eigen/Dense>

using Eigen::MatrixXd;

int main(int argc, char const* argv[]) {
    MatrixXd m(2, 2);
    m(0, 0) = 3;
    m(1, 0) = 2.5;
    m(0, 1) = -1;
    m(1, 1) = m(1, 0) + m(0, 1);
    std::cout << m << std::endl;
    return 0;
}
