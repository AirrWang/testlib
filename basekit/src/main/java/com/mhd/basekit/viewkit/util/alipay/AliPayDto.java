package com.mhd.basekit.viewkit.util.alipay;

import com.example.muheda.functionkit.netkit.model.ModelDto;

/**
 * @author wangfei
 * @date 2019/5/21.
 */
public class AliPayDto extends ModelDto {
    @Override
    public ModelDto toJsonDto(String jsonString) {
        return null;
    }


    public AliPayDataBean getData() {
        return data;
    }

    public void setData(AliPayDataBean data) {
        this.data = data;
    }

    private AliPayDataBean data;

    public class AliPayDataBean {
        public String getPay_info() {
            return pay_info;
        }

        public void setPay_info(String pay_info) {
            this.pay_info = pay_info;
        }

        private String pay_info;
    }
}
