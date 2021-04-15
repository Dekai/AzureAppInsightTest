
class UrlMappings {

    static mappings = {

        "/api/v1/$unrestResource/$unrestAction?/$id?"{
            constraints {
                // apply constraints here
            }
            controller = 'unrestForward'

        }

        "/openapi/api2/$resource/$context**?/$id?"(controller: 'qkrApized', action: "index")

        //UPLOAD TESTING
        "/api/v1/image/create" (controller: "amazonUnrest", action: "createBasicImageForCrop")
        "/api/v1/image/crop" (controller: "amazonUnrest", action: "cropAndSaveImage")
        "/api/v1/amazon/get" (controller: "amazonUnrest", action: "getMerchantBinary")

        "/api/v1/cases21Upload/uploadCases21File" (controller: "cases21UploadUnrest", action: "uploadCases21File")
        "/api/v1/lookupDataUpload/uploadLookupBeneficiaryRecord" (controller: "LookupBeneficiaryUnrest", action: "uploadLookupBeneficiaryRecord")
        "/api/v1/lookupDataUpload/uploadLookupFinance1Record" (controller: "LookupFinance1Unrest", action: "uploadLookupFinance1Record")

        "/"(controller: 'zico', view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

    }
}
