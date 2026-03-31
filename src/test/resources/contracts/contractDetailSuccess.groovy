package contracts

import org.springframework.cloud.contract.spec.Contract
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType

Contract.make {
    description "Inquiry success FIF Konventional V2"
    request {
        url "/inquiries"
        method HttpMethod.POST.toString()
        headers {
            contentType(MediaType.APPLICATION_JSON_VALUE)
            header "x-user-id": 200275
            header "x-user-type": "CUSTOMER"
        }
        body("""
            {
                "beneficiaryNumber": "402001010323",
                "productCode": "FIF"
            }
        """)
    }
    response {
        status OK()
        body("""
            {
                "userId": 200275,
                "transactionNumber": null,
                "beneficiaryNumber": "402001010323",
                "partner": {
                    "id": 1,
                    "userId": 10000008,
                    "name": "FIF",
                    "code": "FIF",
                    "billingType": "MARGIN"
                },
                "merchant": {
                    "id": 1,
                    "name": "astra",
                    "isActive": true
                },
                "product": {
                    "id": 1,
                    "provider": {
                        "id": 1,
                        "code": "FIF",
                        "name": "FIF",
                        "description": null,
                        "startOperationalTime": "00:00:00",
                        "endOperationalTime": "23:59:59",
                        "iconName": "icon.png",
                        "paymentType": "DYNAMIC"
                    },
                    "productCategory": {
                        "id": 1,
                        "code": "INSTALLMENT",
                        "name": "ANGSURAN",
                        "createdBy": null,
                        "updatedBy": null,
                        "tag": "INS",
                        "paymentAllowed": "BALANCE",
                        "createdAt": null,
                        "updatedAt": null
                    },
                    "name": "FIFGROUP",
                    "code": "FIF",
                    "sellPrice": 0.00,
                    "type": "POSTPAID"
                },
                "customerName": "hsnugroho",
                "serialNumber": null,
                "basicPrice": 711000.0,
                "margin": 2000,
                "serviceCharge": 0.0,
                "minimumPayment": 711000.0,
                "convenienceFee": 0.0000,
                "fine": 0,
                "farePrice": 711000.0000,
                "includedServiceChargeCollection": 0,
                "includedServiceChargeAdmin": 0,
                "discount": 2000,
                "discountPercent": 0,
                "promotionDiscount": 0,
                "totalPrice": 711000.0000,
                "tax": 198,
                "taxBase": 1802.0000,
                "status": "SUCCESS",
                "phoneNumber": "081282411395",
                "errorMessage": "Transaksi Sukses",
                "detailAdditionalData": [
                    {
                        "key": "itemName",
                        "value": "FIFGROUP",
                        "label": "Nama Layanan",
                        "copyable": false
                    },
                    {
                        "key": "beneficiaryName",
                        "value": "MAKIMA",
                        "label": "Nama",
                        "copyable": false
                    },
                    {
                        "key": "beneficiaryNumber",
                        "value": "402001010323",
                        "label": "No. Kontrak",
                        "copyable": false
                    },
                    {
                        "key": "dueDate",
                        "value": "19 Mar 2024",
                        "label": "Jatuh Tempo",
                        "copyable": false
                    },
                    {
                        "key": "installmentNumber",
                        "value": "3 / 35 bulan",
                        "label": "Angsuran Ke",
                        "copyable": false
                    },
                    {
                        "key": "platform",
                        "value": "K",
                        "label": "Platform",
                        "copyable": false
                    },
                    {
                        "key": "installmentAmount",
                        "value": "Rp711.000",
                        "label": "Tagihan Angsuran",
                        "copyable": false
                    },
                    {
                        "key": "customerFeeAmount",
                        "value": "Rp0",
                        "label": "Biaya Layanan",
                        "copyable": false
                    },
                    {
                        "key": "outstandingPenalty",
                        "value": "Rp0",
                        "label": "Outstanding Denda",
                        "copyable": false
                    },
                    {
                        "key": "outstandingCollectionFee",
                        "value": "Rp0",
                        "label": "Outstanding Coll Fee",
                        "copyable": false
                    }
                ]
            }
        """)
    }
}