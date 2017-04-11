package tim.mockwebserver;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Tim on 2017/4/11.
 */

public class TicketModel {


    /**
     * Itemno : 41853
     * Uid : 20258
     * ItemName : 貓貓下午茶
     * CategoryId : 1
     * SubCategoryId : 4
     * SubCategoryPicUrl : /CategoryImage/美食其他_未.png
     * ViewType : 3
     * ViewName : 超值優惠
     * QuantityDiscount : []
     * OriginalPrice : 200
     * SellPrice : 150
     * TotalCount : 55
     * SoldCount : 8
     * RemainingCount : 50
     * BeginUseDate : 1489975200
     * ValidDate : 1496757600
     * EndTime : 1496757600
     * ItemPicName_1 : 2017032017165133185.Png
     * ItemPicName_2 : null
     * ItemPicName_3 : null
     * ItemPicName_4 : null
     * ItemPicUrl_1 : /ItemImage/20258/2017032017165133185.Png
     * ItemPicUrl_2 : null
     * ItemPicUrl_3 : null
     * ItemPicUrl_4 : null
     * ItemPicIconUrl_1 : /ItemThumbnails/20258/2017032017165133185.Png
     * ItemPicIconUrl_2 : null
     * ItemPicIconUrl_3 : null
     * ItemPicIconUrl_4 : null
     * TicketStatus : 0
     * ShippingTime : []
     * IsLiked : false
     * StoreInfo : {"Uid":20258,"StoreName":"良心商店","StoreLogoName":"2017032010103227430.Png","StoreLogoUrl":"/StoreImage/Logo/2017032010103227430.Png","City":"台北市","Zone":"南港區","Address":"三重路55號","StoreLat":25.0581950845673,"StoreLng":121.6123039619521,"Distance":87.29363525815616,"DistanceString":"88 M","PhoneNumber":"0937565744","OpeningHour":"10:00~19:00","IsOpening":false,"BusinessStatus":"非營業時間","Note":"哈哈\n睡過頭\n就\n休息\n"}
     */

    @SerializedName("Itemno")
    private int Itemno;
    @SerializedName("Uid")
    private int Uid;
    @SerializedName("ItemName")
    private String ItemName;
    @SerializedName("CategoryId")
    private int CategoryId;
    @SerializedName("SubCategoryId")
    private int SubCategoryId;
    @SerializedName("SubCategoryPicUrl")
    private String SubCategoryPicUrl;
    @SerializedName("ViewType")
    private int ViewType;
    @SerializedName("ViewName")
    private String ViewName;
    @SerializedName("OriginalPrice")
    private int OriginalPrice;
    @SerializedName("SellPrice")
    private int SellPrice;
    @SerializedName("TotalCount")
    private int TotalCount;
    @SerializedName("SoldCount")
    private int SoldCount;
    @SerializedName("RemainingCount")
    private int RemainingCount;
    @SerializedName("BeginUseDate")
    private int BeginUseDate;
    @SerializedName("ValidDate")
    private int ValidDate;
    @SerializedName("EndTime")
    private int EndTime;
    @SerializedName("ItemPicName_1")
    private String ItemPicName1;
    @SerializedName("ItemPicName_2")
    private Object ItemPicName2;
    @SerializedName("ItemPicName_3")
    private Object ItemPicName3;
    @SerializedName("ItemPicName_4")
    private Object ItemPicName4;
    @SerializedName("ItemPicUrl_1")
    private String ItemPicUrl1;
    @SerializedName("ItemPicUrl_2")
    private Object ItemPicUrl2;
    @SerializedName("ItemPicUrl_3")
    private Object ItemPicUrl3;
    @SerializedName("ItemPicUrl_4")
    private Object ItemPicUrl4;
    @SerializedName("ItemPicIconUrl_1")
    private String ItemPicIconUrl1;
    @SerializedName("ItemPicIconUrl_2")
    private Object ItemPicIconUrl2;
    @SerializedName("ItemPicIconUrl_3")
    private Object ItemPicIconUrl3;
    @SerializedName("ItemPicIconUrl_4")
    private Object ItemPicIconUrl4;
    @SerializedName("TicketStatus")
    private int TicketStatus;
    @SerializedName("IsLiked")
    private boolean IsLiked;
    @SerializedName("StoreInfo")
    private StoreInfoBean StoreInfo;
    @SerializedName("QuantityDiscount")
    private List<?> QuantityDiscount;
    @SerializedName("ShippingTime")
    private List<?> ShippingTime;

    public int getItemno() {
        return Itemno;
    }

    public void setItemno(int Itemno) {
        this.Itemno = Itemno;
    }

    public int getUid() {
        return Uid;
    }

    public void setUid(int Uid) {
        this.Uid = Uid;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int CategoryId) {
        this.CategoryId = CategoryId;
    }

    public int getSubCategoryId() {
        return SubCategoryId;
    }

    public void setSubCategoryId(int SubCategoryId) {
        this.SubCategoryId = SubCategoryId;
    }

    public String getSubCategoryPicUrl() {
        return SubCategoryPicUrl;
    }

    public void setSubCategoryPicUrl(String SubCategoryPicUrl) {
        this.SubCategoryPicUrl = SubCategoryPicUrl;
    }

    public int getViewType() {
        return ViewType;
    }

    public void setViewType(int ViewType) {
        this.ViewType = ViewType;
    }

    public String getViewName() {
        return ViewName;
    }

    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    public int getOriginalPrice() {
        return OriginalPrice;
    }

    public void setOriginalPrice(int OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    public int getSellPrice() {
        return SellPrice;
    }

    public void setSellPrice(int SellPrice) {
        this.SellPrice = SellPrice;
    }

    public int getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(int TotalCount) {
        this.TotalCount = TotalCount;
    }

    public int getSoldCount() {
        return SoldCount;
    }

    public void setSoldCount(int SoldCount) {
        this.SoldCount = SoldCount;
    }

    public int getRemainingCount() {
        return RemainingCount;
    }

    public void setRemainingCount(int RemainingCount) {
        this.RemainingCount = RemainingCount;
    }

    public int getBeginUseDate() {
        return BeginUseDate;
    }

    public void setBeginUseDate(int BeginUseDate) {
        this.BeginUseDate = BeginUseDate;
    }

    public int getValidDate() {
        return ValidDate;
    }

    public void setValidDate(int ValidDate) {
        this.ValidDate = ValidDate;
    }

    public int getEndTime() {
        return EndTime;
    }

    public void setEndTime(int EndTime) {
        this.EndTime = EndTime;
    }

    public String getItemPicName1() {
        return ItemPicName1;
    }

    public void setItemPicName1(String ItemPicName1) {
        this.ItemPicName1 = ItemPicName1;
    }

    public Object getItemPicName2() {
        return ItemPicName2;
    }

    public void setItemPicName2(Object ItemPicName2) {
        this.ItemPicName2 = ItemPicName2;
    }

    public Object getItemPicName3() {
        return ItemPicName3;
    }

    public void setItemPicName3(Object ItemPicName3) {
        this.ItemPicName3 = ItemPicName3;
    }

    public Object getItemPicName4() {
        return ItemPicName4;
    }

    public void setItemPicName4(Object ItemPicName4) {
        this.ItemPicName4 = ItemPicName4;
    }

    public String getItemPicUrl1() {
        return ItemPicUrl1;
    }

    public void setItemPicUrl1(String ItemPicUrl1) {
        this.ItemPicUrl1 = ItemPicUrl1;
    }

    public Object getItemPicUrl2() {
        return ItemPicUrl2;
    }

    public void setItemPicUrl2(Object ItemPicUrl2) {
        this.ItemPicUrl2 = ItemPicUrl2;
    }

    public Object getItemPicUrl3() {
        return ItemPicUrl3;
    }

    public void setItemPicUrl3(Object ItemPicUrl3) {
        this.ItemPicUrl3 = ItemPicUrl3;
    }

    public Object getItemPicUrl4() {
        return ItemPicUrl4;
    }

    public void setItemPicUrl4(Object ItemPicUrl4) {
        this.ItemPicUrl4 = ItemPicUrl4;
    }

    public String getItemPicIconUrl1() {
        return ItemPicIconUrl1;
    }

    public void setItemPicIconUrl1(String ItemPicIconUrl1) {
        this.ItemPicIconUrl1 = ItemPicIconUrl1;
    }

    public Object getItemPicIconUrl2() {
        return ItemPicIconUrl2;
    }

    public void setItemPicIconUrl2(Object ItemPicIconUrl2) {
        this.ItemPicIconUrl2 = ItemPicIconUrl2;
    }

    public Object getItemPicIconUrl3() {
        return ItemPicIconUrl3;
    }

    public void setItemPicIconUrl3(Object ItemPicIconUrl3) {
        this.ItemPicIconUrl3 = ItemPicIconUrl3;
    }

    public Object getItemPicIconUrl4() {
        return ItemPicIconUrl4;
    }

    public void setItemPicIconUrl4(Object ItemPicIconUrl4) {
        this.ItemPicIconUrl4 = ItemPicIconUrl4;
    }

    public int getTicketStatus() {
        return TicketStatus;
    }

    public void setTicketStatus(int TicketStatus) {
        this.TicketStatus = TicketStatus;
    }

    public boolean isIsLiked() {
        return IsLiked;
    }

    public void setIsLiked(boolean IsLiked) {
        this.IsLiked = IsLiked;
    }

    public StoreInfoBean getStoreInfo() {
        return StoreInfo;
    }

    public void setStoreInfo(StoreInfoBean StoreInfo) {
        this.StoreInfo = StoreInfo;
    }

    public List<?> getQuantityDiscount() {
        return QuantityDiscount;
    }

    public void setQuantityDiscount(List<?> QuantityDiscount) {
        this.QuantityDiscount = QuantityDiscount;
    }

    public List<?> getShippingTime() {
        return ShippingTime;
    }

    public void setShippingTime(List<?> ShippingTime) {
        this.ShippingTime = ShippingTime;
    }

    public static class StoreInfoBean {
        /**
         * Uid : 20258
         * StoreName : 良心商店
         * StoreLogoName : 2017032010103227430.Png
         * StoreLogoUrl : /StoreImage/Logo/2017032010103227430.Png
         * City : 台北市
         * Zone : 南港區
         * Address : 三重路55號
         * StoreLat : 25.0581950845673
         * StoreLng : 121.6123039619521
         * Distance : 87.29363525815616
         * DistanceString : 88 M
         * PhoneNumber : 0937565744
         * OpeningHour : 10:00~19:00
         * IsOpening : false
         * BusinessStatus : 非營業時間
         * Note : 哈哈
         睡過頭
         就
         休息

         */

        @SerializedName("Uid")
        private int Uid;
        @SerializedName("StoreName")
        private String StoreName;
        @SerializedName("StoreLogoName")
        private String StoreLogoName;
        @SerializedName("StoreLogoUrl")
        private String StoreLogoUrl;
        @SerializedName("City")
        private String City;
        @SerializedName("Zone")
        private String Zone;
        @SerializedName("Address")
        private String Address;
        @SerializedName("StoreLat")
        private double StoreLat;
        @SerializedName("StoreLng")
        private double StoreLng;
        @SerializedName("Distance")
        private double Distance;
        @SerializedName("DistanceString")
        private String DistanceString;
        @SerializedName("PhoneNumber")
        private String PhoneNumber;
        @SerializedName("OpeningHour")
        private String OpeningHour;
        @SerializedName("IsOpening")
        private boolean IsOpening;
        @SerializedName("BusinessStatus")
        private String BusinessStatus;
        @SerializedName("Note")
        private String Note;

        public int getUid() {
            return Uid;
        }

        public void setUid(int Uid) {
            this.Uid = Uid;
        }

        public String getStoreName() {
            return StoreName;
        }

        public void setStoreName(String StoreName) {
            this.StoreName = StoreName;
        }

        public String getStoreLogoName() {
            return StoreLogoName;
        }

        public void setStoreLogoName(String StoreLogoName) {
            this.StoreLogoName = StoreLogoName;
        }

        public String getStoreLogoUrl() {
            return StoreLogoUrl;
        }

        public void setStoreLogoUrl(String StoreLogoUrl) {
            this.StoreLogoUrl = StoreLogoUrl;
        }

        public String getCity() {
            return City;
        }

        public void setCity(String City) {
            this.City = City;
        }

        public String getZone() {
            return Zone;
        }

        public void setZone(String Zone) {
            this.Zone = Zone;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String Address) {
            this.Address = Address;
        }

        public double getStoreLat() {
            return StoreLat;
        }

        public void setStoreLat(double StoreLat) {
            this.StoreLat = StoreLat;
        }

        public double getStoreLng() {
            return StoreLng;
        }

        public void setStoreLng(double StoreLng) {
            this.StoreLng = StoreLng;
        }

        public double getDistance() {
            return Distance;
        }

        public void setDistance(double Distance) {
            this.Distance = Distance;
        }

        public String getDistanceString() {
            return DistanceString;
        }

        public void setDistanceString(String DistanceString) {
            this.DistanceString = DistanceString;
        }

        public String getPhoneNumber() {
            return PhoneNumber;
        }

        public void setPhoneNumber(String PhoneNumber) {
            this.PhoneNumber = PhoneNumber;
        }

        public String getOpeningHour() {
            return OpeningHour;
        }

        public void setOpeningHour(String OpeningHour) {
            this.OpeningHour = OpeningHour;
        }

        public boolean isIsOpening() {
            return IsOpening;
        }

        public void setIsOpening(boolean IsOpening) {
            this.IsOpening = IsOpening;
        }

        public String getBusinessStatus() {
            return BusinessStatus;
        }

        public void setBusinessStatus(String BusinessStatus) {
            this.BusinessStatus = BusinessStatus;
        }

        public String getNote() {
            return Note;
        }

        public void setNote(String Note) {
            this.Note = Note;
        }
    }
}
