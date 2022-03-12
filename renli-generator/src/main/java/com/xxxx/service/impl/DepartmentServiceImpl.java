package com.xxxx.service.impl;

import com.xxxx.pojo.Department;
import com.xxxx.mapper.DepartmentMapper;
import com.xxxx.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhouyunsheng
 * @since 2022-02-28
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
