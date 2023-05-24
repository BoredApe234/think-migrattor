package com.mps.think.setup.sorl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mps.think.setup.model.AddEffort;
import com.mps.think.setup.model.AddPayment;
import com.mps.think.setup.model.AddProcess;
import com.mps.think.setup.model.Addprocessmapping;
import com.mps.think.setup.model.Addresses;
import com.mps.think.setup.model.AutoRenewal;
import com.mps.think.setup.model.AuxVariable;
import com.mps.think.setup.model.CancelReasons;
import com.mps.think.setup.model.CommodityCodes;
import com.mps.think.setup.model.CreditStatus;
import com.mps.think.setup.model.CurrencyExchange;
import com.mps.think.setup.model.CustomerCategory;
import com.mps.think.setup.model.CustomerDetails;
import com.mps.think.setup.model.DeliveryMethodOverrides;
import com.mps.think.setup.model.DeliveryMethods;
import com.mps.think.setup.model.DiscountCardKeyInfo;
import com.mps.think.setup.model.EffectiveDatesForDiscount;
import com.mps.think.setup.model.ExtractFilter;
import com.mps.think.setup.model.Inserts;
import com.mps.think.setup.model.InvoiceEmailsTemplet;
import com.mps.think.setup.model.IssueGeneration;
import com.mps.think.setup.model.IssueSettings;
import com.mps.think.setup.model.JobQueue;
import com.mps.think.setup.model.Jurisdictions;
import com.mps.think.setup.model.LableFormat;
import com.mps.think.setup.model.LableFormatGroups;
import com.mps.think.setup.model.LableGroup;
import com.mps.think.setup.model.LableKeyLine;
import com.mps.think.setup.model.MakePayment;
import com.mps.think.setup.model.MultiLineItemOrder;
import com.mps.think.setup.model.Nth;
import com.mps.think.setup.model.Order;
import com.mps.think.setup.model.OrderAddressMapping;
import com.mps.think.setup.model.OrderAuxiliaryInformation;
import com.mps.think.setup.model.OrderCategory;
import com.mps.think.setup.model.OrderClass;
import com.mps.think.setup.model.OrderClassOverview;
import com.mps.think.setup.model.OrderCodes;
import com.mps.think.setup.model.OrderCodesSuper;
import com.mps.think.setup.model.OrderDeliveryOptions;
import com.mps.think.setup.model.OrderItemDetails;
import com.mps.think.setup.model.OrderItems;
import com.mps.think.setup.model.OrderKeyInformation;
import com.mps.think.setup.model.OrderOptions;
import com.mps.think.setup.model.OrderPackageOptions;
import com.mps.think.setup.model.OrderPaymentOptions;
import com.mps.think.setup.model.OrderThresholdInfo;
import com.mps.think.setup.model.OrdersToBeSuspended;
import com.mps.think.setup.model.OutputSort;
import com.mps.think.setup.model.OutputValue;
import com.mps.think.setup.model.ParentChildMapping;
import com.mps.think.setup.model.PaymentBreakdown;
import com.mps.think.setup.model.PaymentInformation;
import com.mps.think.setup.model.PaymentLinkStatus;
import com.mps.think.setup.model.PaymentThreshold;
import com.mps.think.setup.model.PaymentType;
import com.mps.think.setup.model.ProcessOutput;
import com.mps.think.setup.model.ProcessType;
import com.mps.think.setup.model.ProfitCenter;
import com.mps.think.setup.model.Publisher;
import com.mps.think.setup.model.Queue;
import com.mps.think.setup.model.RCEffortRange;
import com.mps.think.setup.model.RateCards;
import com.mps.think.setup.model.RateCardsRenewals;
import com.mps.think.setup.model.RenewalCard;
import com.mps.think.setup.model.RenewalDefinition;
import com.mps.think.setup.model.RenewalOfferDetails;
import com.mps.think.setup.model.RentalStatus;
import com.mps.think.setup.model.Repeating;
import com.mps.think.setup.model.SalesRepresentative;
import com.mps.think.setup.model.ShippingMethod;
import com.mps.think.setup.model.ShippingPriceList;
import com.mps.think.setup.model.SourceAttributeValues;
import com.mps.think.setup.model.SourceAttributes;
import com.mps.think.setup.model.SourceCode;
import com.mps.think.setup.model.SourceCodeAndValuesMapping;
import com.mps.think.setup.model.SourceFormat;
import com.mps.think.setup.model.SourceFormatAndAttributeMapping;
import com.mps.think.setup.model.SourceFormatSegment;
import com.mps.think.setup.model.SpecialTaxIds;
import com.mps.think.setup.model.Splits;
import com.mps.think.setup.model.SubmitJob;
import com.mps.think.setup.model.SubscriptionCategory;
import com.mps.think.setup.model.SubscriptionDefKeyInfo;
import com.mps.think.setup.model.SuspendOrder;
import com.mps.think.setup.model.TaxRateCategory;
import com.mps.think.setup.model.TaxType;
import com.mps.think.setup.model.Taxonomy;
import com.mps.think.setup.model.Terms;
import com.mps.think.setup.model.TransportMode;
import com.mps.think.setup.model.UnitBasedSubscription;
import com.mps.think.setup.model.ValueForScAttribute;
import com.mps.think.setup.model.VolumeGroup;
import com.mps.think.setup.repo.DeliveryMethodOverridesRepo;
import com.mps.think.setup.service.AddEffortService;
import com.mps.think.setup.service.AddOrderService;
import com.mps.think.setup.service.AddPaymentService;
import com.mps.think.setup.service.AddProcessService;
import com.mps.think.setup.service.AddressService;
import com.mps.think.setup.service.AutoRenewalService;
import com.mps.think.setup.service.AuxService;
import com.mps.think.setup.service.CancelReasonsService;
import com.mps.think.setup.service.CommodityCodesService;
import com.mps.think.setup.service.CreditStatusService;
import com.mps.think.setup.service.CurrencyExchangeService;
import com.mps.think.setup.service.CustomerCategoryService;
import com.mps.think.setup.service.CustomerDetailsService;
import com.mps.think.setup.service.DeliveryMethodOverridesService;
import com.mps.think.setup.service.DeliveryMethodsService;
import com.mps.think.setup.service.DiscountCardKeyInfoService;
import com.mps.think.setup.service.EffectiveDatesForDiscountService;
import com.mps.think.setup.service.ExtractFilterService;
import com.mps.think.setup.service.InsertService;
import com.mps.think.setup.service.InvoiceEmailsTempletService;
import com.mps.think.setup.service.IssueGenerationService;
import com.mps.think.setup.service.IssueSettingsService;
import com.mps.think.setup.service.JobQueueService;
import com.mps.think.setup.service.JurisdictionsService;
import com.mps.think.setup.service.LableFormatGroupsService;
import com.mps.think.setup.service.LableFormatService;
import com.mps.think.setup.service.LableGroupService;
import com.mps.think.setup.service.LableKeyLineService;
import com.mps.think.setup.service.MakePaymentService;
import com.mps.think.setup.service.NthService;
import com.mps.think.setup.service.OrderCategoryService;
import com.mps.think.setup.service.OrderClassOverviewService;
import com.mps.think.setup.service.OrderClassService;
import com.mps.think.setup.service.OrderCodesService;
import com.mps.think.setup.service.OrderThresholdInfoService;
import com.mps.think.setup.service.OutputSortService;
import com.mps.think.setup.service.OutputValueService;
import com.mps.think.setup.service.ParentChildMappingService;
import com.mps.think.setup.service.PaymentInformationService;
import com.mps.think.setup.service.PaymentLinkStatusService;
import com.mps.think.setup.service.PaymentThresholdService;
import com.mps.think.setup.service.PaymentTypeService;
import com.mps.think.setup.service.ProcessOutputService;
import com.mps.think.setup.service.ProcessTypeService;
import com.mps.think.setup.service.ProfitCenterService;
import com.mps.think.setup.service.PublisherSerivce;
import com.mps.think.setup.service.QueueService;
import com.mps.think.setup.service.RCEffortRangeService;
import com.mps.think.setup.service.RateCardsRenewalsService;
import com.mps.think.setup.service.RateCardsService;
import com.mps.think.setup.service.RenewalCardService;
import com.mps.think.setup.service.RenewalDefinitionService;
import com.mps.think.setup.service.RenewalOfferDetailsService;
import com.mps.think.setup.service.RentalStatusService;
import com.mps.think.setup.service.RepeatingService;
import com.mps.think.setup.service.SalesRepresentativeService;
import com.mps.think.setup.service.ShippingMethodService;
import com.mps.think.setup.service.ShippingPriceListService;
import com.mps.think.setup.service.SourceAttributeValuesService;
import com.mps.think.setup.service.SourceAttributesService;
import com.mps.think.setup.service.SourceCodeService;
import com.mps.think.setup.service.SourceFormatSegmentService;
import com.mps.think.setup.service.SourceFormatService;
import com.mps.think.setup.service.SpecialTaxIdsService;
import com.mps.think.setup.service.SplitsService;
import com.mps.think.setup.service.SubmitJobService;
import com.mps.think.setup.service.SubscriptionCategoryService;
import com.mps.think.setup.service.SubscriptionDefKeyInfoService;
import com.mps.think.setup.service.SuspendOrderService;
import com.mps.think.setup.service.TaxRateCategoryService;
import com.mps.think.setup.service.TaxService;
import com.mps.think.setup.service.TaxonomyService;
import com.mps.think.setup.service.TermsService;
import com.mps.think.setup.service.TransportModeService;
import com.mps.think.setup.service.UnitBasedSubscriptionService;
import com.mps.think.setup.service.ValueForScAttributeService;
import com.mps.think.setup.service.VolumeGroupService;

/**
 * Created by @rohit.
 */
@RestController
@CrossOrigin
public class SolrDocumentController {
	@Autowired
	private DocumentRepository documentRepository;
	
	@Autowired
	private CustomerDetailsService customerDetailsService;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	
	private AddEffortService addEffortService;
	
	@Autowired
	private AddPaymentService addPaymentService;
	
	@Autowired
	private AddProcessService addProcessService;
	
	@Autowired
	private AutoRenewalService autoRenewalService;
	
	@Autowired
	private AuxService auxService;
	
	@Autowired
	private CancelReasonsService cancelReasonsService;
	
	@Autowired
	private CommodityCodesService commodityCodesService;
	
	@Autowired
    private CreditStatusService creditStatusService; 
	
	@Autowired
	private CurrencyExchangeService currencyExchangeService;
	
	@Autowired
	private CustomerCategoryService customerCategoryService;
	
	@Autowired
	private DeliveryMethodOverridesService deliveryMethodOverridesService;
	
	@Autowired
	private DeliveryMethodsService DeliveryMethodsService;
	
	@Autowired
	private DiscountCardKeyInfoService discountCardKeyInfoService;
	
	@Autowired
	private EffectiveDatesForDiscountService EffectiveDatesForDiscountService;
	
	@Autowired
	private ExtractFilterService extractFilterService;
	
	@Autowired
	private InsertService insertService;
	
	@Autowired
	private InvoiceEmailsTempletService InvoiceEmailsTempletService;
	
	@Autowired
	private IssueGenerationService issueGenerationService;
	
	@Autowired
	private IssueSettingsService IssueSettingsService;
	
	@Autowired
	private JobQueueService jobQueueService;
	
	@Autowired
	private JurisdictionsService JurisdictionsService;
	
	@Autowired
	private LableFormatService LableFormatService;
	
	@Autowired
	private LableFormatGroupsService lableFormatGroupsService;
	
	@Autowired
	private LableGroupService LableGroupService;
	
	@Autowired
	private LableKeyLineService lableKeyLineService;
	
	@Autowired
	private MakePaymentService MakePaymentService;
	
	@Autowired
	private NthService NthService;
	
	@Autowired
	private AddOrderService AddOrderService;

	
	@Autowired
	private OrderCategoryService orderCategoryService;
	
	@Autowired
	private OrderClassService OrderClassService;
	
	@Autowired
	private OrderClassOverviewService OrderClassOverviewService; 
	
	@Autowired
	private OrderCodesService orderCodesService;
	
	@Autowired
	private SuspendOrderService SuspendOrderService;
	
	@Autowired
	private OrderThresholdInfoService orderThresholdInfoService;
	
	@Autowired
	private OutputSortService outputSortService;
	
	@Autowired
	private OutputValueService outputValueService;
	
	@Autowired
	private ParentChildMappingService parentChildMappingService;
	
	@Autowired
	private PaymentInformationService paymentInformationService;
	
	@Autowired
	private PaymentLinkStatusService paymentLinkStatusService;
	
	@Autowired
	private PaymentThresholdService paymentThresholdService;
	
	@Autowired
	private PaymentTypeService paymentTypeService;
	
	@Autowired
	private ProcessOutputService processOutputService;
	
	@Autowired
	private ProcessTypeService ProcessTypeService;
	
	@Autowired
	private ProfitCenterService profitCenterService;
	
	@Autowired
	private PublisherSerivce publisherSerivce;
	
	@Autowired
	private QueueService QueueService;
	
	@Autowired
	private RateCardsService rateCardsService;
	
	@Autowired
	private RateCardsRenewalsService rateCardsRenewalsService;
	
	@Autowired
	private RCEffortRangeService rCEffortRangeService;
	
	@Autowired
	private RenewalCardService renewalCardService;
	
	@Autowired
	private RenewalDefinitionService renewalDefinitionService;
	
	@Autowired
	private RenewalOfferDetailsService renewalOfferDetailsService;
	
	@Autowired
	private RentalStatusService rentalStatusService;
	
	@Autowired
	private RepeatingService repeatingService;
	
	@Autowired
	private SalesRepresentativeService salesRepresentativeService;
	
	@Autowired
	private ShippingMethodService shippingMethodService;
	
	@Autowired
	private ShippingPriceListService shippingPriceListService;
	
	@Autowired
	private SourceAttributesService sourceAttributesService;
	
	@Autowired
	private SourceAttributeValuesService sourceAttributeValuesService;
	
	@Autowired
	private SourceCodeService sourceCodeService;
	
	@Autowired
	private SourceFormatService sourceFormatService;
	
	@Autowired
	private SourceFormatSegmentService sourceFormatSegmentService;
	
	@Autowired
	private SpecialTaxIdsService specialTaxIdsService;
	
	@Autowired
	private SplitsService splitsService;
	
	@Autowired
	private SubmitJobService submitJobService;
	
	@Autowired
	private SubscriptionCategoryService subscriptionCategoryService;
	
	@Autowired
	private SubscriptionDefKeyInfoService subscriptionDefKeyInfoService;
	
	@Autowired
	private SuspendOrderService suspendOrderService;
	
	@Autowired
	private TaxonomyService taxonomyService;
	
	@Autowired
	private TaxRateCategoryService taxRateCategoryService;
	
	@Autowired
	private TaxService taxService;
	
	@Autowired
	private TermsService termsService;
	
	@Autowired
	private TransportModeService transportModeService;
	
	@Autowired
	private UnitBasedSubscriptionService unitBasedSubscriptionService;
	
	@Autowired
	private ValueForScAttributeService valueForScAttributeService;
	
	@Autowired
	private VolumeGroupService VolumeGroupService;
	
	
	

	@RequestMapping("/")
	public String SpringBootSolrExample() {
		return "Welcome to Spring Boot solr Example";
	}

	@GetMapping("/delete")
	public String deleteAllDocuments() {
		try { // delete all documents from solr core
			documentRepository.deleteAll();
			return "documents deleted succesfully!";
		} catch (Exception e) {
			return "Failed to delete documents";
		}
	}

	@GetMapping("/save")
	public String saveAllDocuments() {
		// Store Documents
		documentRepository.saveAll(Arrays.asList(new Document("1", "pdf", "Java Dev Zone"),
				new Document("2", "msg", "subject:reinvetion"), new Document("3", "pdf", "Spring boot sessions"),
				new Document("4", "docx", "meeting agenda"), new Document("5", "docx", "Spring boot + solr")));
		return "5 documents saved!!!";
	}

	@GetMapping("/getAll")
	public List<Document> getAllDocs() {
		List<Document> documents = new ArrayList<>();
		// iterate all documents and add it to list
		for (Document doc : this.documentRepository.findAll()) {
			documents.add(doc);
		}
		return documents;
	}

	@GetMapping("/saveCustomerDetails")
	public String CustomerDetailsDocuments() {
		// Store Documents
		List<CustomerDetails> cust = customerDetailsService.getAllCustomerDetails();

		// documentRepository.saveAll(Arrays.asList(new Document("CustomerDetails",
		// "customer", cust.toString())));
		for (CustomerDetails customerDetails : cust) {
			documentRepository.save(new Document("CustomerDetails" + customerDetails.getCustomerId(),
					"customer" + customerDetails.getCustomerId(), customerDetails.toString()));
		}

		return "CustomerDetails saved!!!";
	}
	
	@GetMapping("/saveAddressesSolr")
	public String AddressesDocuments() {
		List<Addresses> add = addressService.getAllAddress();	
	for (Addresses addresses : add) {
		documentRepository.save(new Document("Addresses" + addresses.getAddressId(),
				"Address" + addresses.getAddressId(), addresses.toString()));
	}

	return "Addresses saved!!!";
}
	
	@GetMapping("/saveAddEffortSolr")
	public String AddEffortDocuments() {
		List<AddEffort> ae = addEffortService.getAllAddEffort();	
	for (AddEffort addEffort : ae) {
		documentRepository.save(new Document("AddEffort" + addEffort.getId(),
				"Effort" + addEffort.getId(), addEffort.toString()));
	}

	return "AddEffort saved!!!";
	}
	
	@GetMapping("/saveAddPaymentSolr")
	public String AddPaymentDocuments() {
		List<AddPayment> ap = addPaymentService.getAllAddPayment();	
	for (AddPayment addPayment : ap) {
		documentRepository.save(new Document("AddPayment" + addPayment.getId(),
				"AddPayment" + addPayment.getId(), addPayment.toString()));
	}

	return "AddPayment saved!!!";
	}
	
	@GetMapping("/saveAddProcessSolr")
	public String AddProcessDocuments() {
		List<AddProcess> apr = addProcessService.getAllProcess();	
	for (AddProcess addProcess : apr) {
		documentRepository.save(new Document("AddProcess" + addProcess.getId(),
				"AddProcess" + addProcess.getId(), addProcess.toString()));
	}

	return "AddProcess saved!!!";
	}
	
	@GetMapping("/saveAutoRenewalSolr")
	public String AutoRenewalDocuments() {
		List<AutoRenewal> arnl = autoRenewalService.getAllAutoRenewal();	
	for (AutoRenewal autoRenewal : arnl) {
		documentRepository.save(new Document("AutoRenewal" + autoRenewal.getId(),
				"AutoRenewal" + autoRenewal.getId(), autoRenewal.toString()));
	}

	return "AutoRenewal saved!!!";
	}
	
	@GetMapping("/saveAuxVariableSolr")
	public String AuxVariableDocuments() {
		List<AuxVariable> aux = auxService.getAllAuxVariable();	
	for (AuxVariable auxVariable : aux) {
		documentRepository.save(new Document("AuxVariable" + auxVariable.getAuxVarId(),
				"auxVariable" + auxVariable.getAuxVarId(), auxVariable.toString()));
	}

	return "AuxVariable saved!!!";
	}
	
	
	@GetMapping("/saveCancelReasonsSolr")
	public String CancelReasonsDocuments() {
		List<CancelReasons> cr = cancelReasonsService.getAllCancelReasons();	
	for (CancelReasons cancelReasons : cr) {
		documentRepository.save(new Document("CancelReasons" + cancelReasons.getCancelReasonsId(),
				"CancelReasons" + cancelReasons.getCancelReasonsId(), cancelReasons.toString()));
	}

	return "CancelReasons saved!!!";
	}
	
	@GetMapping("/saveCommodityCodesSolr")
	public String CommodityCodesDocuments() {
		List<CommodityCodes> cc = commodityCodesService.getAllCommodityCodes();	
	for (CommodityCodes commodityCodes : cc) {
		documentRepository.save(new Document("CommodityCodes" + commodityCodes.getId(),
				"CommodityCodes" + commodityCodes.getId(), commodityCodes.toString()));
	}

	return "CommodityCodes saved!!!";
	}
	
	@GetMapping("/saveCreditStatusSolr")
	public String CreditStatusDocuments() {
		List<CreditStatus> cc = creditStatusService.getAllCreditStatus();	
	for (CreditStatus creditStatus : cc) {
		documentRepository.save(new Document("CreditStatus" + creditStatus.getCreditId(),
				"CreditStatus" + creditStatus.getCreditId(), creditStatus.toString()));
	}

	return "CreditStatus saved!!!";
	}
	
	@GetMapping("/saveCurrencyExchangeSolr")
	public String CurrencyExchangeDocuments() {
		List<CurrencyExchange> ce = currencyExchangeService.getAllCurrencyExchange();	
	for (CurrencyExchange currencyExchange : ce) {
		documentRepository.save(new Document("CurrencyExchange" + currencyExchange.getCurrencyExchangeId(),
				"CurrencyExchange" + currencyExchange.getCurrencyExchangeId(), currencyExchange.toString()));
	}

	return "CurrencyExchange saved!!!";
	}
	
	@GetMapping("/saveCustomerCategorySolr")
	public String CustomerCategoryDocuments() {
		List<CustomerCategory> cc = customerCategoryService.getAllCustomerCategory();	
	for (CustomerCategory customerCategory : cc) {
		documentRepository.save(new Document("CustomerCategory" + customerCategory.getCustomerCategoryId(),
				"CustomerCategory" + customerCategory.getCustomerCategoryId(), customerCategory.toString()));
	}

	return "CustomerCategory saved!!!";
	}
	
	@GetMapping("/saveDeliveryMethodOverridesSolr")
	public String DeliveryMethodOverridesDocuments() {
		List<DeliveryMethodOverrides> dmo = deliveryMethodOverridesService.getAllDeliveryMethodOverrides();	
	for (DeliveryMethodOverrides deliveryMethodOverrides : dmo) {
		documentRepository.save(new Document("DeliveryMethodOverrides" + deliveryMethodOverrides.getId(),
				"DeliveryMethodOverrides" + deliveryMethodOverrides.getId(), deliveryMethodOverrides.toString()));
	}

	return "DeliveryMethodOverrides saved!!!";
	}
	
	
	@GetMapping("/saveDeliveryMethodsSolr")
	public String DeliveryMethodsDocuments() {
		List<DeliveryMethods> dm = DeliveryMethodsService.getAllDeliveryMethods();	
	for (DeliveryMethods deliveryMethods : dm) {
		documentRepository.save(new Document("DeliveryMethods" + deliveryMethods.getDeliveryMethodsId(),
				"DeliveryMethods" + deliveryMethods.getDeliveryMethodsId(), deliveryMethods.toString()));
	}

	return "DeliveryMethodOverrides saved!!!";
	}
	
	@GetMapping("/saveDiscountCardKeyInfoSolr")
	public String DiscountCardKeyInfoDocuments() {
		List<DiscountCardKeyInfo> dcki = discountCardKeyInfoService.getAllDiscountCardKeyInfo();	
	for (DiscountCardKeyInfo discountCardKeyInfo : dcki) {
		documentRepository.save(new Document("DiscountCardKeyInfo" + discountCardKeyInfo.getId(),
				"DiscountCardKeyInfo" + discountCardKeyInfo.getId(), discountCardKeyInfo.toString()));
	}

	return "DiscountCardKeyInfo saved!!!";
	}
	
	@GetMapping("/saveEffectiveDatesForDiscountSolr")
	public String EffectiveDatesForDiscountDocuments() {
		List<EffectiveDatesForDiscount> edfd = EffectiveDatesForDiscountService.getAllEffectiveDatesForDiscount();	
	for (EffectiveDatesForDiscount effectiveDatesForDiscount : edfd) {
		documentRepository.save(new Document("EffectiveDatesForDiscount" + effectiveDatesForDiscount.getId(),
				"DiscountCardKeyInfo" + effectiveDatesForDiscount.getId(), effectiveDatesForDiscount.toString()));
	}

	return "EffectiveDatesForDiscount saved!!!";
	}
	
	@GetMapping("/saveExtractFilterSolr")
	public String ExtractFilterDocuments() {
		List<ExtractFilter> ef = extractFilterService.getAllExtractFilter();	
	for (ExtractFilter extractFilter : ef) {
		documentRepository.save(new Document("ExtractFilter" + extractFilter.getId(),
				"ExtractFilter" + extractFilter.getId(), extractFilter.toString()));
	}

	return "ExtractFilter saved!!!";
	}
	
	@GetMapping("/saveInsertsSolr")
	public String InsertsDocuments() {
		List<Inserts> i = insertService.getAllInserts();	
	for (Inserts inserts : i) {
		documentRepository.save(new Document("Inserts" + inserts.getId(),
				"Inserts" + inserts.getId(), inserts.toString()));
	}

	return "Inserts saved!!!";
	}
	
	@GetMapping("/saveInvoiceEmailsTempletSolr")
	public String InvoiceEmailsTempletDocuments() {
		List<InvoiceEmailsTemplet> iet = InvoiceEmailsTempletService.getAllInvoiceEmailsTemplet();	
	for (InvoiceEmailsTemplet invoiceEmailsTemplet : iet) {
		documentRepository.save(new Document("InvoiceEmailsTemplet" + invoiceEmailsTemplet.getId(),
				"invoiceEmailsTemplet" + invoiceEmailsTemplet.getId(), invoiceEmailsTemplet.toString()));
	}

	return "invoiceEmailsTemplet saved!!!";
	}
	
	@GetMapping("/saveIssueGenerationSolr")
	public String IssueGenerationDocuments() {
		List<IssueGeneration> ig = issueGenerationService.getAllIssueGeneration();	
	for (IssueGeneration issueGeneration : ig) {
		documentRepository.save(new Document("IssueGeneration" + issueGeneration.getId(),
				"IssueGeneration" + issueGeneration.getId(), issueGeneration.toString()));
	}

	return "IssueGeneration saved!!!";
	}
	
	@GetMapping("/saveIssueSettingsSolr")
	public String IssueSettingsDocuments() {
		List<IssueSettings> is = IssueSettingsService.getAllIssueSettings();	
	for (IssueSettings issueSettings : is) {
		documentRepository.save(new Document("IssueSettings" + issueSettings.getId(),
				"IssueSettings" + issueSettings.getId(), issueSettings.toString()));
	}

	return "IssueSettings saved!!!";
	}
	
	@GetMapping("/saveJobQueueSolr")
	public String JobQueueDocuments() {
		List<JobQueue> jq = jobQueueService.getAllJobQueue();	
	for (JobQueue jobQueue : jq) {
		documentRepository.save(new Document("JobQueue" + jobQueue.getJobid(),
				"JobQueue" + jobQueue.getJobid(), jobQueue.toString()));
	}

	return "JobQueue saved!!!";
	}
	
	@GetMapping("/saveJurisdictionsSolr")
	public String JurisdictionsDocuments() {
		List<Jurisdictions> ju = JurisdictionsService.getAllJurisdictions();	
	for (Jurisdictions jurisdictions : ju) {
		documentRepository.save(new Document("Jurisdictions" + jurisdictions.getId(),
				"Jurisdictions" + jurisdictions.getId(), jurisdictions.toString()));
	}

	return "Jurisdictions saved!!!";
	}
	
	@GetMapping("/saveLableFormatSolr")
	public String LableFormatDocuments() {
		List<LableFormat> lf = LableFormatService.getAllLableFormat();	
	for (LableFormat lableFormat : lf) {
		documentRepository.save(new Document("LableFormat" + lableFormat.getLableFormatId(),
				"LableFormat" + lableFormat.getLableFormatId(), lableFormat.toString()));
	}

	return "LableFormat saved!!!";
	}
	
	@GetMapping("/saveLableFormatGroupsSolr")
	public String LableFormatGroupsDocuments() {
		List<LableFormatGroups> lfg = lableFormatGroupsService.getAllLableFormatGroups();	
	for (LableFormatGroups lableFormatGroups : lfg) {
		documentRepository.save(new Document("LableFormatGroups" + lableFormatGroups.getLableFormatGroupId(),
				"LableFormat" + lableFormatGroups.getLableFormatGroupId(), lableFormatGroups.toString()));
	}

	return "LableFormatGroups saved!!!";
	}
	
	@GetMapping("/saveLableGroupSolr")
	public String LableGroupDocuments() {
		List<LableGroup> lg = LableGroupService.getAllLableGroup();	
	for (LableGroup lableGroup : lg) {
		documentRepository.save(new Document("LableGroup" + lableGroup.getLableGroupId(),
				"LableFormat" + lableGroup.getLableGroupId(), lableGroup.toString()));
	}

	return "LableGroup saved!!!";
	}
	
	@GetMapping("/saveLableKeyLineSolr")
	public String LableKeyLineDocuments() {
		List<LableKeyLine> lkl = lableKeyLineService.getAllLableKeyLine();	
	for (LableKeyLine lableKeyLine : lkl) {
		documentRepository.save(new Document("LableKeyLine" + lableKeyLine.getLableKeylineId(),
				"LableKeyLine" + lableKeyLine.getLableKeylineId(), lableKeyLine.toString()));
	}

	return "LableKeyLine saved!!!";
	}
	
	@GetMapping("/saveMakePaymentSolr")
	public String MakePaymentDocuments() {
		List<MakePayment> mp = MakePaymentService.getAllMakePayment();	
	for (MakePayment makePayment : mp) {
		documentRepository.save(new Document("MakePayment" + makePayment.getId(),
				"MakePayment" + makePayment.getId(), makePayment.toString()));
	}

	return "MakePayment saved!!!";
	}
	
	@GetMapping("/saveNthSolr")
	public String NthDocuments() {
		List<Nth> nth = NthService.getAllNth();	
	for (Nth nth1 : nth) {
		documentRepository.save(new Document("Nth" + nth1.getNthid(),
				"MakePayment" + nth1.getNthid(), nth1.toString()));
	}

	return "Nth saved!!!";
	}
	
	@GetMapping("/saveOrderSolr")
	public String OrderDocuments() {
		List<Order> o = AddOrderService.getAllOrder();	
	for (Order order : o) {
		documentRepository.save(new Document("Order" + order.getOrderId(),
				"Order" + order.getOrderId(), order.toString()));
	}

	return "Order saved!!!";
	}
	
	@GetMapping("/saveOrderAddressMappingSolr")
	public String OrderAddressMappingDocuments() {
		List<OrderAddressMapping> oam = AddOrderService.getAllOrderAddressMapping();	
	for (OrderAddressMapping orderAddressMapping : oam) {
		documentRepository.save(new Document("OrderAddressMapping" + orderAddressMapping.getId(),
				"OrderAddressMapping" + orderAddressMapping.getId(), orderAddressMapping.toString()));
	}

	return "OrderAddressMapping saved!!!";
	}
	
	@GetMapping("/saveOrderAuxiliaryInformationSolr")
	public String OrderAuxiliaryInformationDocuments() {
		List<OrderAuxiliaryInformation> oai = AddOrderService.getAllOrderAuxiliaryInformation();	
	for (OrderAuxiliaryInformation orderAuxiliaryInformation : oai) {
		documentRepository.save(new Document("OrderAuxiliaryInformation" + orderAuxiliaryInformation.getId(),
				"OrderAuxiliaryInformation" + orderAuxiliaryInformation.getId(), orderAuxiliaryInformation.toString()));
	}

	return "OrderAuxiliaryInformation saved!!!";
	}
	
	@GetMapping("/saveOrderCategorySolr")
	public String OrderCategoryDocuments() {
		List<OrderCategory> oc = AddOrderService.getAllOrderCategory();	
	for (OrderCategory orderCategory : oc) {
		documentRepository.save(new Document("OrderCategory" + orderCategory.getOrderCategoryId(),
				"OrderCategory" + orderCategory.getOrderCategoryId(), orderCategory.toString()));
	}

	return "OrderCategory saved!!!";
	}
	
	@GetMapping("/saveOrderClassSolr")
	public String OrderClassDocuments() {
		List<OrderClass> oclass = OrderClassService.getAllOrderClass();	
	for (OrderClass orderClass : oclass) {
		documentRepository.save(new Document("OrderClass" + orderClass.getOcId(),
				"OrderClass" + orderClass.getOcId(), orderClass.toString()));
	}

	return "OrderClass saved!!!";
	}
	
	@GetMapping("/saveOrderClassOverviewSolr")
	public String OrderClassOverviewDocuments() {
		List<OrderClassOverview> oco = OrderClassOverviewService.getAllOrderClassOverview();	
	for (OrderClassOverview orderClassOverview : oco) {
		documentRepository.save(new Document("OrderClassOverview" + orderClassOverview.getId(),
				"OrderClassOverview" + orderClassOverview.getId(), orderClassOverview.toString()));
	}

	return "OrderClassOverview saved!!!";
	}
	
	@GetMapping("/saveOrderCodesSolr")
	public String OrderCodesDocuments() {
		List<OrderCodes> ocodes = orderCodesService.getAllOrderCodes();	
	for (OrderCodes orderCodes : ocodes) {
		documentRepository.save(new Document("OrderCodes" + orderCodes.getId(),
				"OrderCodes" + orderCodes.getId(), orderCodes.toString()));
	}

	return "OrderCodes saved!!!";
	}
	
	@GetMapping("/saveOrderCodesSuperSolr")
	public String OrderCodesSuperDocuments() {
		List<OrderCodesSuper> ocs = orderCodesService.getAllOrderCodesSuper();	
	for (OrderCodesSuper orderCodesSuper : ocs) {
		documentRepository.save(new Document("OrderCodesSuper" + orderCodesSuper.getId(),
				"OrderCodesSuper" + orderCodesSuper.getId(), orderCodesSuper.toString()));
	}

	return "OrderCodesSuper saved!!!";
	}
	
	@GetMapping("/saveOrderDeliveryOptionsSolr")
	public String OrderDeliveryOptionsDocuments() {
		List<OrderDeliveryOptions> odo = AddOrderService.getAllOrderDeliveryOptions();	
	for (OrderDeliveryOptions orderDeliveryOptions : odo) {
		documentRepository.save(new Document("OrderDeliveryOptions" + orderDeliveryOptions.getId(),
				"OrderDeliveryOptions" + orderDeliveryOptions.getId(), orderDeliveryOptions.toString()));
	}

	return "OrderDeliveryOptions saved!!!";
	}
	
	@GetMapping("/saveOrderItemDetailsSolr")
	public String OrderItemDetailsDocuments() {
		List<OrderItemDetails> oid = orderCodesService.getAllOrderItemDetails();	
	for (OrderItemDetails orderItemDetails : oid) {
		documentRepository.save(new Document("OrderItemDetails" + orderItemDetails.getId(),
				"OrderItemDetails" + orderItemDetails.getId(), orderItemDetails.toString()));
	}

	return "OrderItemDetails saved!!!";
	}
	
	@GetMapping("/saveOrderItemsSolr")
	public String OrderItemsDocuments() {
		List<OrderItems> oi = AddOrderService.getAllOrderItems();	
	for (OrderItems orderItems : oi) {
		documentRepository.save(new Document("OrderItems" + orderItems.getId(),
				"OrderItems" + orderItems.getId(), orderItems.toString()));
	}

	return "OrderItems saved!!!";
	}
	
	@GetMapping("/saveOrderKeyInformationSolr")
	public String OrderKeyInformationDocuments() {
		List<OrderKeyInformation> oki = AddOrderService.getAllOrderKeyInformation();	
	for (OrderKeyInformation orderKeyInformation : oki) {
		documentRepository.save(new Document("OrderKeyInformation" + orderKeyInformation.getId(),
				"OrderKeyInformation" + orderKeyInformation.getId(), orderKeyInformation.toString()));
	}

	return "OrderKeyInformation saved!!!";
	}
	
	@GetMapping("/saveOrderPackageOptionsSolr")
	public String OrderPackageOptionsDocuments() {
		List<OrderPackageOptions> opo = orderCodesService.getAllOrderOptions();	
	for (OrderPackageOptions orderPackageOptions : opo) {
		documentRepository.save(new Document("OrderPackageOptions" + orderPackageOptions.getId(),
				"OrderPackageOptions" + orderPackageOptions.getId(), orderPackageOptions.toString()));
	}

	return "OrderPackageOptions saved!!!";
	}
	
	@GetMapping("/saveOrderPaymentOptionsSolr")
	public String OrderPaymentOptionsDocuments() {
		List<OrderPaymentOptions> opayOp = orderCodesService.getAllOrderPaymentOptions();	
	for (OrderPaymentOptions orderPaymentOptions : opayOp) {
		documentRepository.save(new Document("OrderPaymentOptions" + orderPaymentOptions.getId(),
				"OrderPaymentOptions" + orderPaymentOptions.getId(), orderPaymentOptions.toString()));
	}

	return "orderPaymentOptions saved!!!";
	}
	
	@GetMapping("/saveOrdersToBeSuspendedSolr")
	public String OrdersToBeSuspendedDocuments() {
		List<OrdersToBeSuspended> otbs = SuspendOrderService.getAllOrdersToBeSuspended();	
	for (OrdersToBeSuspended ordersToBeSuspended : otbs) {
		documentRepository.save(new Document("OrdersToBeSuspended" + ordersToBeSuspended.getId(),
				"OrdersToBeSuspended" + ordersToBeSuspended.getId(), ordersToBeSuspended.toString()));
	}

	return "OrdersToBeSuspended saved!!!";
	}
	
	@GetMapping("/saveOrderThresholdInfoSolr")
	public String OrderThresholdInfoDocuments() {
		List<OrderThresholdInfo> oti = orderThresholdInfoService.getAllOrderThresholdInfo();	
	for (OrderThresholdInfo orderThresholdInfo : oti) {
		documentRepository.save(new Document("OrdersToBeSuspended" + orderThresholdInfo.getId(),
				"OrdersToBeSuspended" + orderThresholdInfo.getId(), orderThresholdInfo.toString()));
	}

	return "OrderThresholdInfo saved!!!";
	}
	
	@GetMapping("/saveOutputSortSolr")
	public String OutputSortDocuments() {
		List<OutputSort> os = outputSortService.getAllOutputSort();	
	for (OutputSort outputSort : os) {
		documentRepository.save(new Document("OutputSort" + outputSort.getId(),
				"OutputSort" + outputSort.getId(), outputSort.toString()));
	}

	return "OutputSort saved!!!";
	}
	
	@GetMapping("/saveOutputValueSolr")
	public String OutputValueDocuments() {
		List<OutputValue> ov = outputValueService.getAllOutputValue();	
	for (OutputValue outputValue : ov) {
		documentRepository.save(new Document("OutputValue" + outputValue.getId(),
				"OutputValue" + outputValue.getId(), outputValue.toString()));
	}

	return "OutputValue saved!!!";
	}
	
	@GetMapping("/saveParentChildMappingSolr")
	public String ParentChildMappingDocuments() {
		List<ParentChildMapping> pcmp = parentChildMappingService.getAllParentChildMapping();	
	for (ParentChildMapping parentChildMapping : pcmp) {
		documentRepository.save(new Document("ParentChildMapping" + parentChildMapping.getId(),
				"ParentChildMapping" + parentChildMapping.getId(), parentChildMapping.toString()));
	}

	return "ParentChildMapping saved!!!";
	}
	
	@GetMapping("/savePaymentBreakdownSolr")
	public String PaymentBreakdownDocuments() {
		List<PaymentBreakdown> pbwn = AddOrderService.getAllPaymentBreakdown();	
	for (PaymentBreakdown paymentBreakdown : pbwn) {
		documentRepository.save(new Document("PaymentBreakdown" + paymentBreakdown.getId(),
				"PaymentBreakdown" + paymentBreakdown.getId(), paymentBreakdown.toString()));
	}

	return "PaymentBreakdown saved!!!";
	}
	
	@GetMapping("/savePaymentInformationSolr")
	public String PaymentInformationDocuments() {
		List<PaymentInformation> pi = paymentInformationService.getAllPaymentInformation();	
	for (PaymentInformation paymentInformation : pi) {
		documentRepository.save(new Document("PaymentInformation" + paymentInformation.getId(),
				"PaymentInformation" + paymentInformation.getId(), paymentInformation.toString()));
	}

	return "PaymentInformation saved!!!";
	}
	
	@GetMapping("/savePaymentLinkStatusSolr")
	public String PaymentLinkStatusDocuments() {
		List<PaymentLinkStatus> pls = paymentLinkStatusService.getAllPaymentLinkStatus();	
	for (PaymentLinkStatus paymentLinkStatus : pls) {
		documentRepository.save(new Document("PaymentLinkStatus" + paymentLinkStatus.getId(),
				"PaymentLinkStatus" + paymentLinkStatus.getId(), paymentLinkStatus.toString()));
	}

	return "PaymentLinkStatus saved!!!";
	}
	
	@GetMapping("/savePaymentThresholdSolr")
	public String PaymentThresholdDocuments() {
		List<PaymentThreshold> pthsld = paymentThresholdService.getAllPaymentThreshold();	
	for (PaymentThreshold paymentThreshold : pthsld) {
		documentRepository.save(new Document("PaymentThreshold" + paymentThreshold.getPaymentThresholdId(),
				"PaymentThreshold" + paymentThreshold.getPaymentThresholdId(), paymentThreshold.toString()));
	}

	return "PaymentThreshold saved!!!";
	}
	
	@GetMapping("/savePaymentTypeSolr")
	public String PaymentTypeDocuments() {
		List<PaymentType> ptype = paymentTypeService.getAllPaymentType();	
	for (PaymentType paymentType : ptype) {
		documentRepository.save(new Document("PaymentType" + paymentType.getId(),
				"PaymentType" + paymentType.getId(), paymentType.toString()));
	}

	return "PaymentType saved!!!";
	}
	
	@GetMapping("/saveProcessOutputSolr")
	public String ProcessOutputDocuments() {
		List<ProcessOutput> po = processOutputService.getAllProcessOutput();	
	for (ProcessOutput processOutput : po) {
		documentRepository.save(new Document("ProcessOutput" + processOutput.getOutput_id(),
				"ProcessOutput" + processOutput.getOutput_id(), processOutput.toString()));
	}

	return "ProcessOutput saved!!!";
	}
	
	@GetMapping("/saveProcessTypeSolr")
	public String ProcessTypeDocuments() {
		List<ProcessType> ptype = ProcessTypeService.getAllProcessType();	
	for (ProcessType processType : ptype) {
		documentRepository.save(new Document("ProcessType" + processType.getPid(),
				"ProcessType" + processType.getPid(), processType.toString()));
	}

	return "ProcessType saved!!!";
	}
	
	@GetMapping("/saveProfitCenterSolr")
	public String ProfitCenterDocuments() {
		List<ProfitCenter> pcenter = profitCenterService.getAllProfitCenter();	
	for (ProfitCenter profitCenter : pcenter) {
		documentRepository.save(new Document("ProfitCenter" + profitCenter.getProftId(),
				"ProfitCenter" + profitCenter.getProftId(), profitCenter.toString()));
	}

	return "ProfitCenter saved!!!";
	}
	
	@GetMapping("/savePublisherSolr")
	public String PublisherDocuments() {
		List<Publisher> pub = publisherSerivce.getAllPublisher();	
	for (Publisher publisher : pub) {
		documentRepository.save(new Document("Publisher" + publisher.getId(),
				"Publisher" + publisher.getId(), publisher.toString()));
	}

	return "Publisher saved!!!";
	}
	
	@GetMapping("/saveQueueSolr")
	public String QueueDocuments() {
		List<Queue> queue = QueueService.getAllQueue();	
	for (Queue queue1 : queue) {
		documentRepository.save(new Document("Queue" + queue1.getId(),
				"Queue" + queue1.getId(), queue1.toString()));
	}

	return "Queue saved!!!";
	}
	
	@GetMapping("/saveRateCardsSolr")
	public String RateCardsDocuments() {
		List<RateCards> rcard = rateCardsService.getAllRateCards();	
	for (RateCards rateCards : rcard) {
		documentRepository.save(new Document("RateCards" + rateCards.getRcId(),
				"RateCards" + rateCards.getRcId(), rateCards.toString()));
	}

	return "RateCards saved!!!";
	}
	
	@GetMapping("/saveRateCardsRenewalsSolr")
	public String RateCardsRenewalsDocuments() {
		List<RateCardsRenewals> rcr = rateCardsRenewalsService.getAllRateCardsRenewals();	
	for (RateCardsRenewals rateCardsRenewals : rcr) {
		documentRepository.save(new Document("RateCardsRenewals" + rateCardsRenewals.getId(),
				"RateCardsRenewals" + rateCardsRenewals.getId(), rateCardsRenewals.toString()));
	}

	return "RateCardsRenewals saved!!!";
	}
	
	@GetMapping("/saveRCEffortRangeSolr")
	public String RCEffortRangeDocuments() {
		List<RCEffortRange> rcer = rCEffortRangeService.getAllRCEffortRange();	
	for (RCEffortRange rCEffortRange : rcer) {
		documentRepository.save(new Document("RCEffortRange" + rCEffortRange.getId(),
				"RCEffortRange" + rCEffortRange.getId(), rCEffortRange.toString()));
	}

	return "RCEffortRange saved!!!";
	}
	
	@GetMapping("/saveRenewalCardSolr")
	public String RenewalCardDocuments() {
		List<RenewalCard> rc = renewalCardService.getAllRenewalCard();	
	for (RenewalCard rCEffortRange : rc) {
		documentRepository.save(new Document("RenewalCard" + rCEffortRange.getRenewalCardId(),
				"RenewalCard" + rCEffortRange.getRenewalCardId(), rCEffortRange.toString()));
	}

	return "RenewalCard saved!!!";
	}
	
	@GetMapping("/saveRenewalDefinitionSolr")
	public String RenewalDefinitionDocuments() {
		List<RenewalDefinition> rd = renewalDefinitionService.getAllRenewalDefinition();	
	for (RenewalDefinition renewalDefinition : rd) {
		documentRepository.save(new Document("RenewalDefinition" + renewalDefinition.getId(),
				"RenewalDefinition" + renewalDefinition.getId(), renewalDefinition.toString()));
	}

	return "RenewalDefinition saved!!!";
	}
	
	@GetMapping("/saveRenewalOfferDetailsSolr")
	public String RenewalOfferDetailsDocuments() {
		List<RenewalOfferDetails> rod = renewalOfferDetailsService.getAllRenewalOfferDetails();	
	for (RenewalOfferDetails renewalOfferDetails : rod) {
		documentRepository.save(new Document("RenewalOfferDetails" + renewalOfferDetails.getRenewalOfferDetailsId(),
				"RenewalOfferDetails" + renewalOfferDetails.getRenewalOfferDetailsId(), renewalOfferDetails.toString()));
	}

	return "RenewalOfferDetails saved!!!";
	}
	
	@GetMapping("/saveRentalStatusSolr")
	public String RentalStatusDocuments() {
		List<RentalStatus> rs = rentalStatusService.getAllRentalStatus();	
	for (RentalStatus rentalStatus : rs) {
		documentRepository.save(new Document("RentalStatus" + rentalStatus.getRentalStatusId(),
				"RentalStatus" + rentalStatus.getRentalStatusId(), rentalStatus.toString()));
	}

	return "RentalStatus saved!!!";
	}
	
	@GetMapping("/saveRepeatingSolr")
	public String RepeatingDocuments() {
		List<Repeating> r = repeatingService.getAllRepeating();	
	for (Repeating repeating : r) {
		documentRepository.save(new Document("Repeating" + repeating.getId(),
				"Repeating" + repeating.getId(), repeating.toString()));
	}

	return "Repeating saved!!!";
	}
	
	@GetMapping("/saveSalesRepresentativeSolr")
	public String SalesRepresentativeDocuments() {
		List<SalesRepresentative> sr = salesRepresentativeService.getAllSalesRepresentative();	
	for (SalesRepresentative salesRepresentative : sr) {
		documentRepository.save(new Document("SalesRepresentative" + salesRepresentative.getSalesRepID(),
				"SalesRepresentative" + salesRepresentative.getSalesRepID(), salesRepresentative.toString()));
	}

	return "SalesRepresentative saved!!!";
	}
	
	@GetMapping("/saveShippingMethodSolr")
	public String ShippingMethodDocuments() {
		List<ShippingMethod> sm = shippingMethodService.getAllShippingMethod();	
	for (ShippingMethod shippingMethod : sm) {
		documentRepository.save(new Document("ShippingMethod" + shippingMethod.getId(),
				"ShippingMethod" + shippingMethod.getId(), shippingMethod.toString()));
	}

	return "ShippingMethod saved!!!";
	}
	
	@GetMapping("/saveShippingPriceListSolr")
	public String ShippingPriceListDocuments() {
		List<ShippingPriceList> spl = shippingPriceListService.getAllShippingPriceList();	
	for (ShippingPriceList shippingPriceList : spl) {
		documentRepository.save(new Document("ShippingPriceList" + shippingPriceList.getId(),
				"ShippingPriceList" + shippingPriceList.getId(), shippingPriceList.toString()));
	}

	return "ShippingPriceList saved!!!";
	}
	
	@GetMapping("/saveSourceAttributesSolr")
	public String SourceAttributesDocuments() {
		List<SourceAttributes> sa = sourceAttributesService.getAllSourceAttributes();	
	for (SourceAttributes sourceAttributes : sa) {
		documentRepository.save(new Document("SourceAttributes" + sourceAttributes.getId(),
				"SourceAttributes" + sourceAttributes.getId(), sourceAttributes.toString()));
	}

	return "SourceAttributes saved!!!";
	}
	
	@GetMapping("/saveSourceAttributeValuesSolr")
	public String SourceAttributeValuesDocuments() {
		List<SourceAttributeValues> sa = sourceAttributeValuesService.getAllSourceAttributes();	
	for (SourceAttributeValues sourceAttributeValues : sa) {
		documentRepository.save(new Document("SourceAttributeValues" + sourceAttributeValues.getId(),
				"SourceAttributeValues" + sourceAttributeValues.getId(), sourceAttributeValues.toString()));
	}

	return "SourceAttributeValues saved!!!";
	}
	
	@GetMapping("/saveSourceCodeSolr")
	public String SourceCodeDocuments() {
		List<SourceCode> sc = sourceCodeService.getAllSourceCode();	
	for (SourceCode sourceCode : sc) {
		documentRepository.save(new Document("SourceCode" + sourceCode.getSourceCodeId(),
				"SourceCode" + sourceCode.getSourceCodeId(), sourceCode.toString()));
	}

	return "SourceCode saved!!!";
	}
	
	@GetMapping("/saveSourceCodeAndValuesMappingSolr")
	public String SourceCodeAndValuesMappingDocuments() {
		List<SourceCodeAndValuesMapping> scvm = sourceCodeService.getAllSourceCodeAndValuesMapping();	
	for (SourceCodeAndValuesMapping sourceCodeAndValuesMapping : scvm) {
		documentRepository.save(new Document("SourceCodeAndValuesMapping" + sourceCodeAndValuesMapping.getId(),
				"SourceCodeAndValuesMapping" + sourceCodeAndValuesMapping.getId(), sourceCodeAndValuesMapping.toString()));
	}

	return "SourceCodeAndValuesMapping saved!!!";
	}
	
	@GetMapping("/saveSourceFormatSolr")
	public String SourceFormatDocuments() {
		List<SourceFormat> sf = sourceFormatService.getAllSourceFormat();	
	for (SourceFormat sourceFormat : sf) {
		documentRepository.save(new Document("SourceFormat" + sourceFormat.getId(),
				"SourceFormat" + sourceFormat.getId(), sourceFormat.toString()));
	}
	
	return "SourceFormat saved!!!";
	}
	
	@GetMapping("/saveSourceFormatAndAttributeMappingSolr")
	public String SourceFormatAndAttributeMappingDocuments() {
		List<SourceFormatAndAttributeMapping> sfam = sourceFormatService.getAllSourceFormatAndAttributeMapping();	
	for (SourceFormatAndAttributeMapping sourceFormatAndAttributeMapping : sfam) {
		documentRepository.save(new Document("SourceFormatAndAttributeMapping" + sourceFormatAndAttributeMapping.getId(),
				"SourceFormatAndAttributeMapping" + sourceFormatAndAttributeMapping.getId(), sourceFormatAndAttributeMapping.toString()));
	}
	
	return "SourceFormatAndAttributeMapping saved!!!";
	}
	
	@GetMapping("/saveSourceFormatSegmentSolr")
	public String SourceFormatSegmentDocuments() {
		List<SourceFormatSegment> sfs = sourceFormatSegmentService.getAllSourceFormatSegment();	
	for (SourceFormatSegment sourceFormatSegment : sfs) {
		documentRepository.save(new Document("SourceFormatSegment" + sourceFormatSegment.getId(),
				"SourceFormatSegment" + sourceFormatSegment.getId(), sourceFormatSegment.toString()));
	}
	
	return "SourceFormatSegment saved!!!";
	}
	
	@GetMapping("/saveSpecialTaxIdsSolr")
	public String SpecialTaxIdsDocuments() {
		List<SpecialTaxIds> spclTax = specialTaxIdsService.getAllSpecialTaxIds();	
	for (SpecialTaxIds specialTaxIds : spclTax) {
		documentRepository.save(new Document("SpecialTaxIds" + specialTaxIds.getId(),
				"SpecialTaxIds" + specialTaxIds.getId(), specialTaxIds.toString()));
	}
	
	return "SpecialTaxIds saved!!!";
	}
	
	@GetMapping("/saveSplitsSolr")
	public String SplitsDocuments() {
		List<Splits> splt = splitsService.getAllSplits();	
	for (Splits splits : splt) {
		documentRepository.save(new Document("Splits" + splits.getId(),
				"Splits" + splits.getId(), splits.toString()));
	}
	
	return "Splits saved!!!";
	}
	
	@GetMapping("/saveSubmitJobSolr")
	public String SubmitJobDocuments() {
		List<SubmitJob> sj = submitJobService.getAllSubmitJob();	
	for (SubmitJob submitJob : sj) {
		documentRepository.save(new Document("SubmitJob" + submitJob.getId(),
				"SubmitJob" + submitJob.getId(), submitJob.toString()));
	}
	
	return "SubmitJob saved!!!";
	}
	
	
	@GetMapping("/saveSubscriptionCategorySolr")
	public String SubscriptionCategoryDocuments() {
		List<SubscriptionCategory> subscatgry = subscriptionCategoryService.getAllSubscriptionCategory();	
	for (SubscriptionCategory subscriptionCategory : subscatgry) {
		documentRepository.save(new Document("SubscriptionCategory" + subscriptionCategory.getId(),
				"SubscriptionCategory" + subscriptionCategory.getId(), subscriptionCategory.toString()));
	}
	
	return "SubscriptionCategory saved!!!";
	}
	
	@GetMapping("/saveSubscriptionDefKeyInfoSolr")
	public String SubscriptionDefKeyInfoDocuments() {
		List<SubscriptionDefKeyInfo> sdki = subscriptionDefKeyInfoService.getAllSubscriptionDefKeyInfo();	
	for (SubscriptionDefKeyInfo subscriptionDefKeyInfo : sdki) {
		documentRepository.save(new Document("SubscriptionCategory" + subscriptionDefKeyInfo.getId(),
				"SubscriptionCategory" + subscriptionDefKeyInfo.getId(), subscriptionDefKeyInfo.toString()));
	}
	
	return "SubscriptionDefKeyInfo saved!!!";
	}
	
	@GetMapping("/saveSuspendOrderSolr")
	public String SuspendOrderDocuments() {
		List<SuspendOrder> sdki = suspendOrderService.getAllSuspendOrder();	
	for (SuspendOrder suspendOrder : sdki) {
		documentRepository.save(new Document("SuspendOrder" + suspendOrder.getId(),
				"SuspendOrder" + suspendOrder.getId(), suspendOrder.toString()));
	}
	
	return "SuspendOrder saved!!!";
	}
	
	@GetMapping("/saveTaxonomySolr")
	public String TaxonomyDocuments() {
		List<Taxonomy> tnomy = taxonomyService.getAllTaxonomy();	
	for (Taxonomy taxonomy : tnomy) {
		documentRepository.save(new Document("Taxonomy" + taxonomy.getId(),
				"Taxonomy" + taxonomy.getId(), taxonomy.toString()));
	}
	
	return "Taxonomy saved!!!";
	}
	
	@GetMapping("/saveTaxRateCategorySolr")
	public String TaxRateCategoryDocuments() {
		List<TaxRateCategory> trc = taxRateCategoryService.getAllTaxRateCategory();	
	for (TaxRateCategory taxRateCategory : trc) {
		documentRepository.save(new Document("TaxRateCategory" + taxRateCategory.getId(),
				"TaxRateCategory" + taxRateCategory.getId(), taxRateCategory.toString()));
	}
	
	return "TaxRateCategory saved!!!";
	}
	
	@GetMapping("/saveTaxTypeSolr")
	public String TaxTypeDocuments() {
		List<TaxType> tt = taxService.getAllTaxType();	
	for (TaxType taxType : tt) {
		documentRepository.save(new Document("TaxType" + taxType.getTaxId(),
				"TaxType" + taxType.getTaxId(), taxType.toString()));
	}
	
	return "TaxType saved!!!";
	}
	
	@GetMapping("/saveTermsSolr")
	public String TermsDocuments() {
		List<Terms> t = termsService.getAllTerms();	
	for (Terms terms : t) {
		documentRepository.save(new Document("Terms" + terms.getTermsId(),
				"Terms" + terms.getTermsId(), terms.toString()));
	}
	
	return "Terms saved!!!";
	}
	
	@GetMapping("/saveTransportModeSolr")
	public String TransportModeDocuments() {
		List<TransportMode> tm = transportModeService.getAllTransportMode();	
	for (TransportMode transportMode : tm) {
		documentRepository.save(new Document("TransportMode" + transportMode.getId(),
				"TransportMode" + transportMode.getId(), transportMode.toString()));
	}
	
	return "TransportMode saved!!!";
	}
	
	@GetMapping("/saveUnitBasedSubscriptionSolr")
	public String UnitBasedSubscriptionDocuments() {
		List<UnitBasedSubscription> ubs = unitBasedSubscriptionService.getAllUnitBasedSubscription();	
	for (UnitBasedSubscription unitBasedSubscription : ubs) {
		documentRepository.save(new Document("UnitBasedSubscription" + unitBasedSubscription.getUbsid(),
				"UnitBasedSubscription" + unitBasedSubscription.getUbsid(), unitBasedSubscription.toString()));
	}
	
	return "UnitBasedSubscription saved!!!";
	}
	
	@GetMapping("/saveValueForScAttributeSolr")
	public String ValueForScAttributeDocuments() {
		List<ValueForScAttribute> vfsa = valueForScAttributeService.getAllValueForScAttribute();	
	for (ValueForScAttribute valueForScAttribute : vfsa) {
		documentRepository.save(new Document("ValueForScAttribute" + valueForScAttribute.getId(),
				"ValueForScAttribute" + valueForScAttribute.getId(), valueForScAttribute.toString()));
	}
	
	return "ValueForScAttribute saved!!!";
	}
	
	@GetMapping("/saveVolumeGroupSolr")
	public String VolumeGroupDocuments() {
		List<VolumeGroup> vfsa = VolumeGroupService.getAllVolumeGroup();	
	for (VolumeGroup volumeGroup : vfsa) {
		documentRepository.save(new Document("VolumeGroup" + volumeGroup.getVolumeGroupId(),
				"VolumeGroup" + volumeGroup.getVolumeGroupId(), volumeGroup.toString()));
	}
	
	return "VolumeGroup saved!!!";
	}
	
	@GetMapping("/saveMultiLineItemOrderSolr")
	public String MultiLineItemOrderDocuments() {
		List<MultiLineItemOrder> mlio = AddOrderService.getAllMultiLineItemOrder();	
	for (MultiLineItemOrder multiLineItemOrder : mlio) {
		documentRepository.save(new Document("MultiLineItemOrder" + multiLineItemOrder.getId(),
				"MultiLineItemOrder" + multiLineItemOrder.getId(), multiLineItemOrder.toString()));
	}
	
	return "MultiLineItemOrder saved!!!";
	}
	
	@GetMapping("/saveAddprocessmappingSolr")
	public String AddprocessmappingDocuments() {
		List<Addprocessmapping> apm = addProcessService.getAllAddprocessmapping();	
	for (Addprocessmapping addprocessmapping : apm) {
		documentRepository.save(new Document("Addprocessmapping" + addprocessmapping.getPmid(),
				"Addprocessmapping" + addprocessmapping.getPmid(), addprocessmapping.toString()));
	}
	
	return "Addprocessmapping saved!!!";
	}
}